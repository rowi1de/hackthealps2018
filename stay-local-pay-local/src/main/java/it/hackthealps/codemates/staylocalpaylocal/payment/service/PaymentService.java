package it.hackthealps.codemates.staylocalpaylocal.payment.service;

import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoProductException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoShopException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.AccommodationRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.EventRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.GastronomyRepository;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.User;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories.UserRepository;

@Service
public class PaymentService {
	private final static Logger LOG = LoggerFactory.getLogger(PaymentService.class);
	private int pointMult = 10;

	@Autowired
	UserRepository repo;

	@Autowired
	AccommodationRepository accomRepo;

	@Autowired
	EventRepository eventRepo;

	@Autowired
	GastronomyRepository gastroRepo;

	public boolean pay(PaymentDTO payment) throws NoUserException, NoShopException, NoProductException {
		LOG.debug("got payment {}:", payment);
		User user = repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db"));
		LOG.debug("User from DB:{}", user);
		return (user.getTokenIdentification().equals(payment.getCustomerTokenIdentification()))
				? saveSuccess(user, payment)
				: false;
	}

	private boolean saveSuccess(User user, PaymentDTO payment) throws NoUserException {
		user.setTransactionKey(payment.getCustomerTransactionKey());
		setScoreAndPriceFrom(payment, user);
		repo.save(user);
		LOG.debug("After from DB:{}", repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db")));
		return true;
	}

	// TODO price
	private void setScoreAndPriceFrom(PaymentDTO payment, User user) {
		int scoreToAdd = 0;
		int price = 0;
		Long modelID = payment.getModelID();
		Optional<AccommodationModel> accom = modelID > 0 ? accomRepo.findById(modelID)
				: accomRepo.findByTitle(payment.getModelName());
		Optional<GastronomyModel> gastro = modelID > 0 ? gastroRepo.findById(modelID)
				: gastroRepo.findByTitle(payment.getModelName());
		Optional<EventModel> event = modelID > 0 ? eventRepo.findById(modelID)
				: eventRepo.findByTitle(payment.getModelName());
		if (accom.isPresent()) {
			AccommodationModel am = accom.get();
			scoreToAdd = getScoreValueToAdd(am.getScoreModel().getScoreValue());
			price = getPrice(am.getScoreModel().getScoreValue());
			LOG.debug("Accommodation from DB:{}", am);
		}
		if (gastro.isPresent()) {
			GastronomyModel gm = gastro.get();
			scoreToAdd = getScoreValueToAdd(gm.getScoreModel().getScoreValue());
			price = getPrice(gm.getScoreModel().getScoreValue());
			LOG.debug("Gastro from DB:{}", gm);
		}
		if (event.isPresent()) {
			EventModel em = event.get();
			scoreToAdd = getScoreValueToAdd(em.getScoreModel().getScoreValue());
			price = getPrice(em.getScoreModel().getScoreValue());
			LOG.debug("Event from DB:{}", em);
		}
		if (payment.isGreenTravel()) {
			scoreToAdd += 20;
			user.setGreenTravel(true);
		}
		user.setPoints(user.getPoints() + scoreToAdd);
		user.setTotal(user.getTotal() - price);
	}

	private int getScoreValueToAdd(ScoreValue scoreValue) {
		switch (scoreValue) {
		case ONE_STAR:
			return pointMult;
		case TWO_STAR:
			return pointMult * 2;
		case THREE_STAR:
			return pointMult * 3;
		default:
			return pointMult / 2;
		}
	}

	private int getPrice(ScoreValue scoreValue) {
		Random r = new Random();
		int nextInt = r.nextInt(100);
		switch (scoreValue) {
		case ONE_STAR:
			return nextInt * 2;
		case TWO_STAR:
			return nextInt * 3;
		case THREE_STAR:
			return nextInt * 4;
		default:
			return nextInt;
		}
	}

}
