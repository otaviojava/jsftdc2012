package br.com.tdc.cdi;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author otavio
 */
@SessionScoped
@Named
public class UsuarioBean implements Serializable{
    @Inject
    private Enquete enquete;
    
    private boolean votado=false;

    public void votar(){
        votado=true;
    }
    
    public Enquete getEnquete() {
        return enquete;
    }

    public void setEnquete(Enquete enquete) {
        this.enquete = enquete;
    }

    public boolean isVotado() {
        return votado;
    }

    public void setVotado(boolean votado) {
        this.votado = votado;
    }
    
    
    
    
    
}
