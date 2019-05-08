package domain;

public class Meteoro extends Meteoroide{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	
	
	
	public Meteoro(String nome, int idade, Sistema sistema) {
		this.nome = nome;
		this.idade = idade;
		this.sistema = sistema;
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
			a.removeMeteoro(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removeMeteoro(this);
			
			this.sistema = sistema;
			sistema.addMeteoro(this);
		}
		
	}
}
