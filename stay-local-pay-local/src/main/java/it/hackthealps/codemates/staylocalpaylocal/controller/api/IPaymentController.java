package it.hackthealps.codemates.staylocalpaylocal.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.dto.RewardDTO;

public interface IPaymentController {
	@PostMapping(value = "pay", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RewardDTO> uploadInvoiceForOCR(PaymentDTO payment) throws NoUserException;
}
