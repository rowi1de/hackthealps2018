package it.hackthealps.codemates.staylocalpaylocal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackthealps.codemates.staylocalpaylocal.common.NoProductException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoShopException;
import it.hackthealps.codemates.staylocalpaylocal.common.NoUserException;
import it.hackthealps.codemates.staylocalpaylocal.dto.PaymentDTO;
import it.hackthealps.codemates.staylocalpaylocal.model.enitites.Product;
import it.hackthealps.codemates.staylocalpaylocal.model.enitites.Shop;
import it.hackthealps.codemates.staylocalpaylocal.model.enitites.User;
import it.hackthealps.codemates.staylocalpaylocal.model.repositories.ProductRepository;
import it.hackthealps.codemates.staylocalpaylocal.model.repositories.ShopRepository;
import it.hackthealps.codemates.staylocalpaylocal.model.repositories.UserRepository;

@Service
public class PaymentService {
	private final static Logger LOG = LoggerFactory.getLogger(PaymentService.class);

	@Autowired
	UserRepository repo;

	@Autowired
	ShopRepository shops;
	
	@Autowired
	ProductRepository prods;

	public boolean pay(PaymentDTO payment) throws NoUserException, NoShopException, NoProductException {
		LOG.debug("got payment {}:", payment);
		User user = repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db"));
		Shop shop = shops.findByTokenIdentification(payment.getShopTokenIdentification())
				.orElseThrow(() -> new NoShopException("no auth shop"));
		Product product = prods.findByProductID(payment.getProductID()).orElseThrow(()-> new NoProductException("no prod"));
		LOG.debug("User from DB:{}", user);
		LOG.debug("Shop from DB:{}", shop);
		LOG.debug("Product from DB:{}", product);
		return (user.getTokenIdentification().equals(payment.getCustomerTokenIdentification())) ? saveSuccess(user, payment)
				: false;
	}

	private boolean saveSuccess(User user, PaymentDTO payment) throws NoUserException {
		user.setTransactionKey(payment.getCustomerTransactionKey());
		user.setPoints(100);
		repo.save(user);
		LOG.debug("After from DB:{}", repo.findById(42L).orElseThrow(() -> new NoUserException("nothing in db")));
		return true;
	}
}
