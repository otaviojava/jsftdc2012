package br.com.tdc.scopo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@ViewScoped
public class ContadorViewBean extends ContadorBean implements Serializable{

    @Override
    public String getNome() {
       return "Contador com Escopo de Visão";
    }
    
}
