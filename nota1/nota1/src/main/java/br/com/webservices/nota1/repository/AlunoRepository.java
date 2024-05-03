package br.com.webservices.nota1.repository;

import br.com.webservices.nota1.model.Aluno;
import br.com.webservices.nota1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webservices.nota1.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
