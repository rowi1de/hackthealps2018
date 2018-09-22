package it.hackthealps.codemates.staylocalpaylocal.opendata.repository;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<AccommodationModel, Long> {
	Optional<AccommodationModel> findByTitle(String title);
}
