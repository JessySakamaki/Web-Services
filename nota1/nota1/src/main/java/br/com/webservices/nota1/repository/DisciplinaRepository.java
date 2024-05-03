package br.com.webservices.nota1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservices.nota1.model.Disciplina;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

}
