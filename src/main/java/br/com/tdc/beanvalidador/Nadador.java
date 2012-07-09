
package br.com.tdc.beanvalidador;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author otavio
 */
public class Nadador implements  Serializable{
    
    @NotNull(message="O campo nome é obrigatório")
     @Size(min=10,max=80,message="O tamanho do nome deve ser entre 10 e 80")
    private String nome;
    
    @Min(value=18,message="Necessário ser de maior de idade")
    @Max(value=80,message="Não indicado para atividade física")
    private Integer idade;    
    
    @Pattern(regexp="^[_A-Za-z0-9-]+(\\." +"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +"(\\.[A-Za-z]{2,})$",message="Email inválido")
    private String email;

    
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
