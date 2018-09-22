package it.hackthealps.codemates.staylocalpaylocal.opendata.repository;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventModel, Long> {
	Optional<EventModel> findByTitle(String title);
}
