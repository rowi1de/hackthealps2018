package it.hackthealps.codemates.staylocalpaylocal.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.hackthealps.codemates.staylocalpaylocal.common.NoProductException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoShopException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.payment.controller.api.IPaymentController;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.dto.RewardDTO;
import it.hackthealps.codemates.staylocalpaylocal.payment.service.PaymentService;

@RestController
public class PaymentController implements IPaymentController {

	@Autowired
	PaymentService service;

	@Override
	public ResponseEntity<RewardDTO> uploadInvoiceForOCR(@RequestBody PaymentDTO payment) throws NoUserException, NoShopException, NoProductException  {

		return service.pay(payment) ? ResponseEntity.ok(new RewardDTO().setReward("100 Points"))
				: ResponseEntity.badRequest().build();
	}

}
