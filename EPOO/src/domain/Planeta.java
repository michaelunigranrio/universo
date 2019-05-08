package domain;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Corpo_Celeste{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	private List<Satelite> listaSatelite;
	
	
	
	public Planeta(String nome, int idade, Sistema sistema, List<Satelite> listaSatelite) {
		this.nome = nome;
		this.idade = idade;
		this.setSistema(sistema);
		this.listaSatelite = new ArrayList<Satelite>();
	}

	
	
	public Sistema getSistema() {
		return sistema;
	}

	
	public void setSistema(Sistema sistema) {
		if(this.sistema == sistema)		
			return;
		
		if(sistema == null) {
			Sistema a = this.sistema;
			this.sistema = null;
			a.removePlaneta(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removePlaneta(this);
			
			this.sistema = sistema;
			sistema.addPlaneta(this);
		}
		
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


	public List<Satelite> getListaSatelite() {
		return listaSatelite;
	}


	public void addSatelite(Satelite satelite) {
		if(this.listaSatelite.contains(satelite))
				return;
		this.listaSatelite.add(satelite);
		satelite.setPlaneta(this);
	}
	
	public void removeSatelite (Satelite satelite) {
		if(! this.listaSatelite.contains(satelite))
			return;
		this.listaSatelite.remove(satelite);
		satelite.setPlaneta(null);
	}
}
