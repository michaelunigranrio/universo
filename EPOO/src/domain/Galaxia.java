package domain;

import java.util.ArrayList;
import java.util.List;

public class Galaxia {

	private String nome;
	private int idade;
	private Universo universo;
	private List<Sistema> listaSistema;
	
	public Galaxia(String nome, int idade, Universo universo, List<Sistema> listaSistema) {
		this.nome = nome;
		this.idade = idade;
		this.setUniverso(universo);
		this.listaSistema = new ArrayList<Sistema>();
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Universo getUniverso() {
		return universo;
	}


	public void setUniverso(Universo universo) {
		if(this.universo == universo)		
			return;
		
		if(universo == null) {
			Universo a = this.universo;
			this.universo = null;
			a.removeGalaxia(this);
			
		}
		
		else {
			if(this.universo != universo)
				this.universo.removeGalaxia(this);
			
			this.universo = universo;
			universo.addGalaxia(this);
		}
		
	}
	
	
	public List<Sistema> getListaSistema() {
		return listaSistema;
	}
	
	
	public void addSistema(Sistema sistema) {
		if(this.listaSistema.contains(sistema))
				return;
		this.listaSistema.add(sistema);
		sistema.setGalaxia(this);
	}
	
	
	public void removeSistema (Sistema sistema) {
		if(! this.listaSistema.contains(sistema))
			return;
		this.listaSistema.remove(sistema);
		sistema.setGalaxia(null);
	}

}
