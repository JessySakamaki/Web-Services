package br.com.webservices.nota1.resource;

import java.util.List;

import org.springframework.http.MediaType;
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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletResponse;
@RestController
@RequestMapping("/aluno")
public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;

    //Post
    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
)
    @Operation(
        summary = "Cria um aluno",
        description = "Método responsável para criar um aluno no sistema",
        tags = {"aluno"})
    @ApiResponses({
        @ApiResponse(responseCode = "201"),
        @ApiResponse(responseCode = "303"),
        @ApiResponse(responseCode = "304"),
        @ApiResponse(responseCode = "404"),
        @ApiResponse(responseCode = "500")})

    //Get
    @GetMapping
    public List<Aluno> list(){
        return alunoRepository.findAll();
    }
    
}
