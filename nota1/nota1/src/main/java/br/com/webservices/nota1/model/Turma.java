package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

    //Variáveis
    @Column(name = "turma_ano")
    private int ano;

    @Column(name = "turma_semestre")
    private int semestre;

    @Column(name = "turma_dia_semana")
    private int diaSemana;

    @Column(name = "turma_horarios")
    private String horarios;

    //ESSE TRECO DNV AAAAAAA
    public void abrirTurma(){
    }
    public void alocarProfessor(){
    }
    public void matricularAluno(){
    }
    public void emitirDiario(){
    }

    //Getters e setters
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public int getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
    public String getHorarios() {
        return horarios;
    }
    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
    
}
