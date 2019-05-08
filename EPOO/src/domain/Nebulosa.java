package domain;

public class Nebulosa {

	private String nome;
	private int idade;
	private Universo universo;
	
	public Nebulosa(String nome, int idade, Universo universo) {
		this.nome = nome;
		this.idade = idade;
		this.setUniverso(universo);
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
			a.removeNebulosa(this);
			
		}
		
		else {
			if(this.universo != universo)
				this.universo.removeNebulosa(this);
			
			this.universo = universo;
			universo.addNebulosa(this);
		}
		
	}
	

}
