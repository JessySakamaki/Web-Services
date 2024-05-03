package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {

    //Variaveis
    @Column(name = "titulacao_professor")
    private String titulacaoMaxima;

    //Bgl la dnv
    public void cadastrar(){}

    //Get set
        public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
    
}
