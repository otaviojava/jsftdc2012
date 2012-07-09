
package br.com.tdc.scopo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@RequestScoped
public class ContadorRequestBean extends ContadorBean  implements Serializable{

    @Override
    public String getNome() {
     return "Contador com Escopo de Request";
    }
    
}
