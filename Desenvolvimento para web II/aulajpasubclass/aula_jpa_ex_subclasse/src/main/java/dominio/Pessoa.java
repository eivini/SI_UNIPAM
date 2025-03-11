package dominio;

import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Generated;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable {

    @Inherited
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long idPessoa;
    private String nome;
    private String cpf;

    public Pessoa(){
        this("","");
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.getNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Strin getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", CPF=" + cpf + "]";
    }
}

