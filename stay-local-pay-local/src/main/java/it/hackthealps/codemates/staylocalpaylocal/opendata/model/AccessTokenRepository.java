package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessTokenRepository extends JpaRepository<AccessTokenModel, String> {


}
