
package br.com.tdc.scopo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@SessionScoped
public class ContadorSessaoBean extends ContadorBean  implements Serializable{

    @Override
    public String getNome() {
     return "Contador com Escopo de Sessão";
    }
    
}
