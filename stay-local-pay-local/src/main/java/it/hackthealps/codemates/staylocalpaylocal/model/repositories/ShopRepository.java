package it.hackthealps.codemates.staylocalpaylocal.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackthealps.codemates.staylocalpaylocal.model.enitites.Shop;


public interface ShopRepository extends JpaRepository<Shop, Long>{

	Optional<Shop> findByTokenIdentification(String tokenId);
}
