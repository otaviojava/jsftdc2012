
package br.com.tdc.css.converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**N
 *
 * @author otavio
 */
@ViewScoped
@ManagedBean
public class ColetaneaBean implements  Serializable{
    
	private static final long serialVersionUID = 3358602292908581133L;
	
	private Coletanea coletaneaSelecionada;

    
    public List<Coletanea> getColetaneas(){
    List<Coletanea> coletaneas=new ArrayList<Coletanea>();
    coletaneas.add(new Coletanea(10, "Roupa Nova Acustico", 2005));
    coletaneas.add(new Coletanea(12, "Roupa Nova Acustico 2", 2010));
    coletaneas.add(new Coletanea(16, "Paula Fernandes Acustico", 2012));
 
    return coletaneas;
    }

    public Coletanea getColetaneaSelecionada() {
        return coletaneaSelecionada;
    }

    public void setColetaneaSelecionada(Coletanea coletaneaSelecionada) {
        this.coletaneaSelecionada = coletaneaSelecionada;
    }
   
  
  
  

  
  
  
    
    
    
    
}
