package it.hackthealps.codemates.staylocalpaylocal.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.dto.LoginDTO;
import it.hackthealps.codemates.staylocalpaylocal.dto.TokenDTO;

public interface ILoginController {

	@PostMapping(value = "token", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	// acutally currentuser but whatever
	public ResponseEntity<TokenDTO> getToken(LoginDTO login) throws NoUserException;

}
