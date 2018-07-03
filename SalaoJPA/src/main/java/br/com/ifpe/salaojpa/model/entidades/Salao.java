/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wemerson
 */
@Entity
public class Salao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_salao;
    @Column(name = "cnpj", length = 11)
    private String cnpj;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Embedded
    private Endereco endereco;
    @Column(name = "login", length = 30, unique = true)
    private String login;
    @Column(name = "senha", length = 10)
    private String senha;

    public Salao() {
    }

    public Salao(String cnpj, String nome, Endereco endereco, String login, String senha) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    public int getId_salao() {
        return id_salao;
    }

    public void setId_salao(int id_salao) {
        this.id_salao = id_salao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id_salao;
        hash = 13 * hash + Objects.hashCode(this.cnpj);
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.endereco);
        hash = 13 * hash + Objects.hashCode(this.login);
        hash = 13 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salao other = (Salao) obj;
        if (this.id_salao != other.id_salao) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Salao{" + "id_salao=" + id_salao + ", cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
}
