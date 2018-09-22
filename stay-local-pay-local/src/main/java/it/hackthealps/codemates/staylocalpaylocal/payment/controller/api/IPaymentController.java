package it.hackthealps.codemates.staylocalpaylocal.payment.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import it.hackthealps.codemates.staylocalpaylocal.common.NoProductException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoShopException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.RewardDTO;

public interface IPaymentController {
	@PostMapping(value = "pay", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RewardDTO> uploadInvoiceForOCR(PaymentDTO payment) throws NoUserException, NoShopException, NoProductException ;
}
