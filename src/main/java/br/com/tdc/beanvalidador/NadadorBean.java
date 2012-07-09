package br.com.tdc.beanvalidador;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@ViewScoped
public class NadadorBean implements Serializable{
    
    private Nadador time;
    
    private List<String> nadadores;
   
    public void submeter(){
        nadadores.add(time.getNome()+" - "+time.getIdade()+" - "+time.getEmail());
    }
    public NadadorBean() {
        
        time=new Nadador();
        nadadores=new LinkedList<String>();
   
    }

    public Nadador getTime() {
        return time;
    }

    public void setTime(Nadador nadador) {
        this.time = nadador;
    }

    public List<String> getNadadores() {
        return nadadores;
    }

    public void setNadadores(List<String> nadadores) {
        this.nadadores = nadadores;
    }

    
}
