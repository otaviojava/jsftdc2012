
package br.com.tdc.css;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author otavio
 */
@ManagedBean
@ViewScoped
public class CorTextoBean implements Serializable{
    
    private String texto;
    
    private String cor;

    public String getCor() {
        return cor;
    }

    public String getCorEstilo() {
        return "#".concat(cor);
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public CorTextoBean(){
        StringBuilder mensagem=new StringBuilder();
        mensagem.append("São 37 trilhas com assuntos diferentes. Cada trilha é um dia inteiro de evento! Monte \n");
        mensagem.append(" sua agenda escolhendo uma trilha por dia. Java, Ruby, Python, PHP, C/C++, Scala, .NET, \n");
        mensagem.append(" Arduino, Testes, Marketing Digital, Robótica, Banco de Dados, Android, iOS, WindowsPhone \n ");
        mensagem.append(" e muito mais. ");
        texto=mensagem.toString();
        cor="000000";
    }
}
