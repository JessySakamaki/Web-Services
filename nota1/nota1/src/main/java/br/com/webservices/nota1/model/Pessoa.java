package br.com.webservices.nota1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    // Variáveis
    @Column(name = "pessoa_nome")
    private String nome;

    @Column(name = "pessoa_endereco")
    private String endereco;

    @Column(name = "pessoa_telefone")
    private String telefone;

    // Ainda nn lembro oq é isso
    public void cadastrar() {
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
