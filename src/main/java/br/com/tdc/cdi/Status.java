package br.com.tdc.cdi;

/**
 *
 * @author otavio
 */
public enum Status {
    
    OTIMO("ótimo"),GOSTOU("Gostou"),NAO_GOSTOU("Não Gostou"),PESSIMO("Péssimo");
    private String nome;
    Status(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
