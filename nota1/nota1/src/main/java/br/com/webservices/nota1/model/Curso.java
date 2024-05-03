package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

    // Variáveis
    @Column(name = "codigo_curso")
    private int codigo;

    @Column(name = "descricao_curso")
    private String descricao;

    // Esqueci o nome desse treco mas é o void la que pediu
    public void cadastrar() {
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
