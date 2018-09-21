package it.hackthealps.codemates.staylocalpaylocal.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackthealps.codemates.staylocalpaylocal.model.enitites.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	Optional<Product> findByProductID(String prodID);
}
