package br.com.tdc.cdi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author otavio
 */

public class ContadorEnquete implements Serializable{
    
    private Integer otimo;
    
    private Integer gostou;
    
    private Integer naoGostou;
    
    private Integer pessimo;

    public Integer getGostou() {
        return gostou;
    }

    public void setGostou(Integer gostou) {
        this.gostou = gostou;
    }

    public Integer getNaoGostou() {
        return naoGostou;
    }

    public void setNaoGostou(Integer naoGostou) {
        this.naoGostou = naoGostou;
    }

    public Integer getOtimo() {
        return otimo;
    }

    public void setOtimo(Integer otimo) {
        this.otimo = otimo;
    }

    public Integer getPessimo() {
        return pessimo;
    }

    public void setPessimo(Integer pessimo) {
        this.pessimo = pessimo;
    }

    public ContadorEnquete() {
        otimo=0;
        gostou=0;
        naoGostou=0;
        pessimo=0;  
    }

    void incrementarOtimo() {
      otimo+=1;
    }

    void incrementarGostou() {
        gostou+=1;
    }

    void incrementarNaoGostou() {
        naoGostou+=1;
    }

    void incrementarPessimo() {
        pessimo+=1;
    }

    public void incrementar(Status status){
    
    switch (status) {
            case OTIMO:
                incrementarOtimo();
                break;
            case GOSTOU:
                incrementarGostou();
                break;
            case NAO_GOSTOU:
                incrementarNaoGostou();
                break;
            case PESSIMO:
                incrementarPessimo();

        }
    }

    public Map<String, Number> getNumeros() {
        Map<String, Number> numeros=new HashMap<String, Number>();
        numeros.put("Otimo", otimo);
        numeros.put("Gostou", gostou);
        numeros.put("Não Gostou", naoGostou);
        numeros.put("Péssimo", pessimo);
        return numeros;
    }
    
    
}
