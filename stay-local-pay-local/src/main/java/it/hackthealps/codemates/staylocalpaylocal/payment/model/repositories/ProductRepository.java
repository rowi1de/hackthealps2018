package it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	Optional<Product> findByProductID(String prodID);
}
