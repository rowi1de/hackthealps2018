package it.hackthealps.codemates.staylocalpaylocal.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PayExceptionHandler extends ResponseEntityExceptionHandler {

	public PayExceptionHandler() {
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Payment not possible")
	@ExceptionHandler(PaymentException.class)
	protected void paymentNotPossible() {
	}

}
