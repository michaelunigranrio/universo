package domain;

import java.util.ArrayList;
import java.util.List;

public class Universo {

	private String nome;
	private List<Nebulosa> listaNebulosa;
	private List<Galaxia> listaGalaxia;

	
	public Universo(String nome, Nebulosa listaNebulosa, Galaxia listaGalaxia) {
		this.nome = nome;
		this.listaNebulosa = new ArrayList<Nebulosa>();
		this.listaGalaxia = new ArrayList<Galaxia>();
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void addNebulosa(Nebulosa nebulosa) {
		if(this.listaNebulosa.contains(nebulosa))
				return;
		this.listaNebulosa.add(nebulosa);
		nebulosa.setUniverso(this);
	}
	
	public void removeNebulosa(Nebulosa nebulosa) {
		if(! this.listaNebulosa.contains(nebulosa))
			return;
		this.listaNebulosa.remove(nebulosa);
		nebulosa.setUniverso(null);
	}
	
	public void addGalaxia(Galaxia galaxia) {
		if(this.listaGalaxia.contains(galaxia))
				return;
		this.listaGalaxia.add(galaxia);
		galaxia.setUniverso(this);
	}
	
	public void removeGalaxia(Galaxia galaxia) {
		if(! this.listaGalaxia.contains(galaxia))
			return;
		this.listaGalaxia.remove(galaxia);
		galaxia.setUniverso(null);
	}
	
}
