package br.com.tdc.html5;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@ViewScoped
public class CanvasBean implements Serializable{
    
    private String cor;
    
    private int  tamanho;

    public CanvasBean() {
        
        cor="000000";
        tamanho=3;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
    
}
