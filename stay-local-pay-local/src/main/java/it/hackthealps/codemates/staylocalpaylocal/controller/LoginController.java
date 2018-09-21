package it.hackthealps.codemates.staylocalpaylocal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.controller.api.ILoginController;
import it.hackthealps.codemates.staylocalpaylocal.dto.LoginDTO;
import it.hackthealps.codemates.staylocalpaylocal.dto.TokenDTO;
import it.hackthealps.codemates.staylocalpaylocal.service.LoginService;
@RestController
public class LoginController implements ILoginController {

	@Autowired
	LoginService service;

	@Override
	public ResponseEntity<TokenDTO> getToken(@RequestBody LoginDTO login) throws NoUserException {
		return ResponseEntity.ok(service.getToken());
	}

}
