package br.com.webservices.nota1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.webservices.nota1.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}
