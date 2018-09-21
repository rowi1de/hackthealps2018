package it.hackthealps.codemates.staylocalpaylocal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.controller.api.IPaymentController;
import it.hackthealps.codemates.staylocalpaylocal.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.dto.RewardDTO;
import it.hackthealps.codemates.staylocalpaylocal.service.PaymentService;

@RestController
public class PaymentController implements IPaymentController {

	@Autowired
	PaymentService service;

	@Override
	public ResponseEntity<RewardDTO> uploadInvoiceForOCR(@RequestBody PaymentDTO payment) throws NoUserException {

		return service.pay(payment) ? ResponseEntity.ok(new RewardDTO().setReward("100 Points"))
				: ResponseEntity.badRequest().build();
	}

}
