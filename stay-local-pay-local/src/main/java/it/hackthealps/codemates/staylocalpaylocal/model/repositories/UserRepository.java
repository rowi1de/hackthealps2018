package it.hackthealps.codemates.staylocalpaylocal.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackthealps.codemates.staylocalpaylocal.model.enitites.User;

public interface UserRepository extends JpaRepository<User, Long>
{
}
