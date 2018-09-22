package it.hackthealps.codemates.staylocalpaylocal.payment.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
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
}
