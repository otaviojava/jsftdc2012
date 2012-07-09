package br.com.tdc.validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *Classe para realizar a validação do emil
 * @author otaviojava
 */
@FacesValidator("CorreioEletronicoValidador")
public class CorreioEletronicoValidador implements Validator{
private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +"(\\.[A-Za-z]{2,})$";
   private Pattern pattern;
 
	public CorreioEletronicoValidador(){
  pattern = Pattern.compile(EMAIL_PATTERN);
	}
 
	
	@Override
	public void validate(FacesContext context, UIComponent component,Object value) throws ValidatorException {
		if(value.toString().length()==0){
			FacesMessage msg = 	new FacesMessage("Campo obrigatório não informado!", "Campo obrigatório não informado!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		Matcher	matcher = pattern.matcher(value.toString());
		if(!matcher.matches()){
 
			FacesMessage msg = 	new FacesMessage("Email com o formato errado.", "Email com o formato errado.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
                        
		}
 
	}
    
}