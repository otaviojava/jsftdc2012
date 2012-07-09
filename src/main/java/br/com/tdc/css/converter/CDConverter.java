package br.com.tdc.css.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author otavio
 */

@FacesConverter(value="cdConverter", forClass=Coletanea.class)
public class CDConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String[] valores=value.split("-");
        Coletanea cd= new Coletanea();
        cd.setNome(valores[0]);
        cd.setAno(Integer.parseInt(valores[1]));
        cd.setNumeroMusicas(Integer.parseInt(valores[2]));
        return cd;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
     Coletanea cd=(Coletanea)value;
     StringBuilder string=new StringBuilder();
     string.append(cd.getNome());
     string.append("-");
     string.append(cd.getAno());
     string.append("-");
     string.append(cd.getNumeroMusicas());
     return string.toString();
    }
    
}
