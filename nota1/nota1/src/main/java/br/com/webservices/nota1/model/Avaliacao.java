package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {

    //Variáveis
    @Column(name = "avaliacao_nota1")
    private float nota1;

    @Column(name = "avaliacao_nota2")
    private float nota2;

    @Column(name = "avaliacao_nota_prova_final")
    private float notaProvaFinal;

    @Column(name = "avaliacao_frequencia")
    private int frequencia;

    //AAAAAAAAAAAAAAAAAAAAAAAA
    public void lancarAvaliacao(){
    }
    public void calcularAprovacao(){
    }

    //Getters e setters
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getNotaProvaFinal() {
        return notaProvaFinal;
    }
    public void setNotaProvaFinal(float notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    
}
