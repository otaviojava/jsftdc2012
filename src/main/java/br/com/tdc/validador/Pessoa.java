
package br.com.tdc.validador;

import java.io.Serializable;

/**
 *
 * @author otavio
 */
public class Pessoa implements Serializable{
    
    private String nome;
    
    private String cpf;
    
    private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Pessoa() {
    }
    
    
    
}
