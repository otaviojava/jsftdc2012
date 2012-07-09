
package br.com.tdc.scopo;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author otavio
 */
@ManagedBean
@ApplicationScoped
public class ContadorAplicacaoBean extends ContadorBean  implements Serializable{

    @Override
    public String getNome() {
     return "Contador com Escopo de Aplicação";
    }
    
}
