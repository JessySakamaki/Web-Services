package br.com.webservices.nota1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.webservices.nota1.model.Aluno;
import br.com.webservices.nota1.repository.AlunoRepository;
import jakarta.servlet.http.HttpServletResponse;
@RestController
@RequestMapping("/aluno")
public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> list(){
        return alunoRepository.findAll();
    }
    
}
