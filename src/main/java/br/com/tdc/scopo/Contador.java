package br.com.tdc.scopo;

import java.io.Serializable;

/**
 *
 * @author otavio
 */
public class Contador implements  Serializable{

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void incrementar(){
        valor++;
    }
    
    
}
