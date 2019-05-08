package domain;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private String nome;
	private int idade;
	private Galaxia galaxia;
	private List<Planeta> listaPlaneta;
	private List<Satelite> listaSatelite;
	private List<Estrela> listaEstrela;
	private List<Cometa> listaCometa;
	private List<Meteorito> listaMeteorito;
	private List<Meteoro> listaMeteoro;
	private List<Asteroide> listaAsteroide;
	
	public Sistema(String nome, int idade, Galaxia galaxia, List<Planeta> listaPlaneta, List<Satelite> listaSatelite,
			List<Estrela> listaEstrela, List<Cometa> listaCometa, List<Meteorito> listaMeteorito, List<Meteoro> listaMeteoro,
			List<Asteroide> listaAsteroide) {
		this.nome = nome;
		this.idade = idade;
		this.setGalaxia(galaxia);
		this.listaPlaneta = new ArrayList<Planeta>();
		this.listaSatelite = new ArrayList<Satelite>();
		this.listaEstrela = new ArrayList<Estrela>();
		this.listaCometa = new ArrayList<Cometa>();
		this.listaMeteorito = new ArrayList<Meteorito>();
		this.listaMeteoro = new ArrayList<Meteoro>();
		this.listaAsteroide = new ArrayList<Asteroide>();





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


	public List<Planeta> getListaPlaneta() {
		return listaPlaneta;
	}


	public List<Satelite> getListaSatelite() {
		return listaSatelite;
	}


	public List<Estrela> getListaEstrela() {
		return listaEstrela;
	}


	public List<Cometa> getListaCometa() {
		return listaCometa;
	}


	public List<Meteorito> getListaMeteorito() {
		return listaMeteorito;
	}


	public List<Meteoro> getListaMeteoro() {
		return listaMeteoro;
	}


	public List<Asteroide> getListaAsteroide() {
		return listaAsteroide;
	}

	
	public Galaxia getGalaxia() {
		return galaxia;
	}

	
	public void setGalaxia(Galaxia galaxia) {
		if(this.galaxia == galaxia)		
			return;
		
		if(galaxia == null) {
			Galaxia a = this.galaxia;
			this.galaxia = null;
			a.removeSistema(this);
			
		}
		
		else {
			if(this.galaxia != galaxia)
				this.galaxia.removeSistema(this);
			
			this.galaxia = galaxia;
			galaxia.addSistema(this);
		}
		
	}
	
	
	public void addPlaneta(Planeta planeta) {
		if(this.listaPlaneta.contains(planeta))
				return;
		this.listaPlaneta.add(planeta);
		planeta.setSistema(this);
	}
	
	public void removePlaneta (Planeta planeta) {
		if(! this.listaPlaneta.contains(planeta))
			return;
		this.listaPlaneta.remove(planeta);
		planeta.setSistema(null);
	}
	
	public void addSatelite(Satelite satelite) {
		if(this.listaSatelite.contains(satelite))
				return;
		this.listaSatelite.add(satelite);
		satelite.setSistema(this);
	}
	
	public void removeSatelite (Satelite satelite) {
		if(! this.listaSatelite.contains(satelite))
			return;
		this.listaSatelite.remove(satelite);
		satelite.setSistema(null);
	}
	
	public void addEstrela(Estrela estrela) {
		if(this.listaEstrela.contains(estrela))
				return;
		this.listaEstrela.add(estrela);
		estrela.setSistema(this);
	}
	
	public void removeEstrela (Estrela estrela) {
		if(! this.listaEstrela.contains(estrela))
			return;
		this.listaEstrela.remove(estrela);
		estrela.setSistema(null);
	}
	
	public void addCometa(Cometa cometa) {
		if(this.listaCometa.contains(cometa))
				return;
		this.listaCometa.add(cometa);
		cometa.setSistema(this);
	}
	
	public void removeCometa (Cometa cometa) {
		if(! this.listaCometa.contains(cometa))
			return;
		this.listaCometa.remove(cometa);
		cometa.setSistema(null);
	}
	
	public void addMeteorito(Meteorito meteorito) {
		if(this.listaMeteorito.contains(meteorito))
				return;
		this.listaMeteorito.add(meteorito);
		meteorito.setSistema(this);
	}
	
	public void removeMeteorito (Meteorito meteorito) {
		if(! this.listaMeteorito.contains(meteorito))
			return;
		this.listaMeteorito.remove(meteorito);
		meteorito.setSistema(null);
	}
	
	public void addMeteoro(Meteoro meteoro) {
		if(this.listaMeteoro.contains(meteoro))
				return;
		this.listaMeteoro.add(meteoro);
		meteoro.setSistema(this);
	}
	
	public void removeMeteoro (Meteoro meteoro) {
		if(! this.listaMeteoro.contains(meteoro))
			return;
		this.listaMeteoro.remove(meteoro);
		meteoro.setSistema(null);
	}
	
	public void addAsteroide(Asteroide asteroide) {
		if(this.listaAsteroide.contains(asteroide))
				return;
		this.listaAsteroide.add(asteroide);
		asteroide.setSistema(this);
	}
	
	public void removeAsteroide (Asteroide asteroide) {
		if(! this.listaAsteroide.contains(asteroide))
			return;
		this.listaAsteroide.remove(asteroide);
		asteroide.setSistema(null);
	}
}
