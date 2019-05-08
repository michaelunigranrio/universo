package domain;

public class Asteroide extends Corpo_Celeste{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	
	
	public Asteroide(String nome, int idade, Sistema sistema) {
		this.nome = nome;
		this.idade = idade;
		this.setSistema(sistema);
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
			a.removeAsteroide(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removeAsteroide(this);
			
			this.sistema = sistema;
			sistema.addAsteroide(this);
		}
		
	}
}
