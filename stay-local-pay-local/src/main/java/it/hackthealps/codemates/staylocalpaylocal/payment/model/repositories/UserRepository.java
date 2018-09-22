package it.hackthealps.codemates.staylocalpaylocal.payment.model.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import it.hackthealps.codemates.staylocalpaylocal.payment.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{
}
