package domain;

public class Satelite extends Corpo_Celeste{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	private Planeta planeta;
	
	
	
	public Satelite(String nome, int idade, Sistema sistema, Planeta planeta) {
		this.nome = nome;
		this.idade = idade;
		this.setSistema(sistema);
		this.setPlaneta(planeta);
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
			a.removeSatelite(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removeSatelite(this);
			
			this.sistema = sistema;
			sistema.addSatelite(this);
		}
		
	}
	
	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		if(this.planeta == planeta)		
			return;
		
		if(planeta == null) {
			Planeta a = this.planeta;
			this.planeta = null;
			a.removeSatelite(this);
			
		}
		
		else {
			if(this.planeta != planeta)
				this.planeta.removeSatelite(this);
			
			this.planeta = planeta;
			planeta.addSatelite(this);
		}
		
	}
}
