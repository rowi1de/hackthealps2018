package it.hackthealps.codemates.staylocalpaylocal.opendata.repository;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastronomyRepository extends JpaRepository<GastronomyModel, Long> {
}
