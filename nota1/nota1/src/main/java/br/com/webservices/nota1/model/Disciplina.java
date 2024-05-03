package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "disciplina")
public class Disciplina {

    //Variáveis
    @Column(name = "disciplina_codigo")
    private int codigo;

    @Column(name = "disciplina_descricao")
    private String descricao;

    @Column(name = "disciplina_carga_horaria")
    private int cargaHoraria;

    @Column(name = "disciplina_ementa")
    private String ementa;

    @Column(name = "disciplina_bibliografia")
    private String bibliografia;

    //Esse treco DNVVVV
    public void cadastrar(){
    }

    //Getters e setters
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
 
}
