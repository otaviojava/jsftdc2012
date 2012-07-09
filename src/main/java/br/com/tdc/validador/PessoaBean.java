package br.com.tdc.validador;

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
public class PessoaBean implements Serializable{
    
    private Pessoa pessoa;
    
    private List<Pessoa> pessoas;
    
    
    public void adicionar(){
    
    pessoas.add(new Pessoa(pessoa.getNome(),pessoa.getCpf(), pessoa.getEmail()));
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    
    
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

       
    
    public PessoaBean() {
        pessoa=new Pessoa();
        pessoas=new LinkedList<Pessoa>();
    }
    
    
    
}
