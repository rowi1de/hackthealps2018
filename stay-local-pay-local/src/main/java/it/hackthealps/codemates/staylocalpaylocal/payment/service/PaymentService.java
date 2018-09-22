package it.hackthealps.codemates.staylocalpaylocal.payment.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoProductException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoShopException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.BaseModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.AccommodationRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.BaseRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.EventRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.GastronomyRepository;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.Product;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.Shop;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.User;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories.ProductRepository;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories.ShopRepository;
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
		int scoreToAdd = getScoreFrom(payment);

		user.setPoints(user.getPoints() + scoreToAdd);
		repo.save(user);

		LOG.debug("After from DB:{}", repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db")));
		return true;
	}

	private int getScoreFrom(PaymentDTO payment) {
		int scoreToAdd = 0;
		Long modelID = payment.getModelID();
		Optional<AccommodationModel> accom = accomRepo.findById(modelID);
		Optional<GastronomyModel> gastro = gastroRepo.findById(modelID);
		Optional<EventModel> event = eventRepo.findById(modelID);
		if (accom.isPresent()) {
			AccommodationModel am = accom.get();
			scoreToAdd = getScoreValueToAdd(am.getScoreModel().getScoreValue());
			LOG.debug("Accommodation from DB:{}", am);

		}
		if (gastro.isPresent()) {
			GastronomyModel gm = gastro.get();
			scoreToAdd = getScoreValueToAdd(gm.getScoreModel().getScoreValue());
			LOG.debug("Gastro from DB:{}", gm);

		}
		if (event.isPresent()) {
			EventModel em = event.get();
			scoreToAdd = getScoreValueToAdd(em.getScoreModel().getScoreValue());
			LOG.debug("Event from DB:{}", em);

		}
		return scoreToAdd;
	}

	private int getScoreValueToAdd(ScoreValue scoreValue) {
		return scoreValue == scoreValue.ZERO_STAR ? pointMult : pointMult * 2;
	}

}
