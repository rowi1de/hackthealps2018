package it.hackthealps.codemates.staylocalpaylocal.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.dto.TokenDTO;
import it.hackthealps.codemates.staylocalpaylocal.model.enitites.User;
import it.hackthealps.codemates.staylocalpaylocal.model.repositories.UserRepository;
@Service
public class LoginService {
	@Autowired
	UserRepository repository;

	public TokenDTO getToken() throws NoUserException {
		String token = UUID.randomUUID().toString();
		User user = repository.findById(42L).orElseThrow(() -> new NoUserException("no user in db"));

		user.setToken(token);
		repository.save(user);

		return new TokenDTO().setToken(token);
	}
}
