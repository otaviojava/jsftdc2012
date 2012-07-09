
package br.com.tdc.cdi;

import java.io.Serializable;

/**
 *
 * @author otavio
 */

public class Enquete implements Serializable{

    private String nome;
    
    private String contato;

    
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
