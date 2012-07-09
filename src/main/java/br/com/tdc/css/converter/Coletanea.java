package br.com.tdc.css.converter;

import java.io.Serializable;

/**
 *
 * @author otavio
 */
public class Coletanea implements Serializable{
    
    private Integer numeroMusicas;
    
    private String nome;
    
    private Integer ano;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(Integer numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    public Coletanea() {
    }

    public Coletanea(Integer numeroMusicas, String nome, Integer ano) {
        this.numeroMusicas = numeroMusicas;
        this.nome = nome;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coletanea other = (Coletanea) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return 97 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        
    }


    
}
