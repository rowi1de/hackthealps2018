package it.hackthealps.codemates.staylocalpaylocal.opendata.repository;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastronomyRepository extends JpaRepository<GastronomyModel, Long> {
	Optional<GastronomyModel> findByTitle(String title);
}
