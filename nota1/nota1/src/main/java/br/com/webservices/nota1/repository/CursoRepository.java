package br.com.webservices.nota1.repository;

import br.com.webservices.nota1.model.Aluno;
import br.com.webservices.nota1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
