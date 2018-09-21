package it.hackthealps.codemates.staylocalpaylocal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.model.enitites.User;
import it.hackthealps.codemates.staylocalpaylocal.model.repositories.UserRepository;
@Service
public class PaymentService {
	@Autowired
	UserRepository repo;

	public boolean pay(PaymentDTO payment) throws NoUserException {
		User user = repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db"));
		return (user.getToken().equals(payment.getToken())) ? saveSuccess(user) : false;
	}

	private boolean saveSuccess(User user) {
		user.setToken(null);
		user.setPoints(100);
		repo.save(user);
		return true;
	}
}
