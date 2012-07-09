
package br.com.tdc.cdi;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.faces.model.SelectItem;

/**
 *
 * @author otavio
 */
@Model
public class ListaBean implements Serializable{
    
    
    public List<SelectItem> getStatus(){
       List<SelectItem> itens=new LinkedList<SelectItem>(); 
        
       for(Status status:Status.values()){
       itens.add(new SelectItem(status, status.getNome()));
       }
       return itens;
    }
    
}
