package it.hackthealps.codemates.staylocalpaylocal.payment.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.LoginDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.ProfileDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.TokenDTO;

public interface ILoginController {

	@PostMapping(value = "token", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenDTO> getToken(LoginDTO login) throws NoUserException;
	

	@GetMapping(value = "profile", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProfileDTO> getProfile() throws NoUserException;

}
