package it.hackthealps.codemates.staylocalpaylocal.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.payment.controller.api.ILoginController;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.LoginDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.ProfileDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.TokenDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.service.PayLoginService;


@RestController
public class LoginController implements ILoginController {

	@Autowired
	PayLoginService service;

	@Override
	public ResponseEntity<TokenDTO> getToken(@RequestBody LoginDTO login) throws NoUserException {
		return ResponseEntity.ok(service.getToken());
	}

	@Override
	public ResponseEntity<ProfileDTO> getProfile() throws NoUserException {
		return ResponseEntity.ok(service.getProfile());
	}

}
