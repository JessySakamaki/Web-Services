package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
// Acho que é assim
public class Aluno extends Pessoa {

    // Variaveis
    @Column(name = "alunos_matricula")
    private String matricula;

    @Column(name = "situacao_matricula")
    private String situacao;

    // MTOS dos bgl q nn sei
    public void matricularCurso() {
    }

    public void trancar() {
    }

    public void formar() {
    }

    public void evadir() {
    }

    public void obterAvaliacoes() {
    }

    public void emitirHistorico() {
    }

    // Getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
