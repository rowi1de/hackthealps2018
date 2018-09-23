package it.hackthealps.codemates.staylocalpaylocal.payment.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.ProfileDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.TokenDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.User;
import it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories.UserRepository;

@Service
public class PayLoginService {
	@Autowired
	UserRepository repository;

	public TokenDTO getToken() throws NoUserException {
		String token = UUID.randomUUID().toString();
		User user = repository.findById(42L).orElseThrow(() -> new NoUserException("no user in db"));

		user.setTransactionKey(token);
		repository.save(user);

		return new TokenDTO().setToken(token);
	}

	public ProfileDTO getProfile() {
		Optional<User> user = repository.findById(42L);
		return setAdditionals(user.get());
	}

	private ProfileDTO setAdditionals(User us) {
		ProfileDTO temp = new ProfileDTO().setFirstName(us.getFirstName()).setLastName(us.getLastName())
				.setTotal(us.getTotal()).setRewards(us.getPoints()).setTokenIdent(us.getTokenIdentification());
		if (us.isGreenTravel()) {
			temp.setText("Because you are a green traveler, you earn extra 20 Points! Congratulations!");
		}
		return temp;
	}
}
