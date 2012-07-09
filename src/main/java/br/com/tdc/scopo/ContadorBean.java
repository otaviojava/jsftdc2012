package br.com.tdc.scopo;

/**
 *
 * @author otavio
 */
public abstract class ContadorBean {
    abstract  String getNome(); 
    
     private Contador contador;    
     
     ContadorBean(){
     contador=new Contador();
     }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }
     
     
}
