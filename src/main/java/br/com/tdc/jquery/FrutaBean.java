package br.com.tdc.jquery;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class FrutaBean implements Serializable {

	private static final long serialVersionUID = 2960026942396617291L;
	
	
	private List<String> frutas;
	
	private List<String> frutasSelecionadas;

	public List<String> getFrutas() {
		return frutas;
	}

	public void setFrutas(List<String> frutas) {
		this.frutas = frutas;
	}

	public List<String> getFrutasSelecionadas() {
		return frutasSelecionadas;
	}

	public void setFrutasSelecionadas(List<String> frutasSelecionadas) {
		this.frutasSelecionadas = frutasSelecionadas;
	}
	
	public FrutaBean(){
		frutas=new LinkedList<String>();
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Pera");
		frutas.add("Goiaba");
		frutas.add("Maçã");
		frutasSelecionadas=new LinkedList<String>();
		
	}


}
