package domain;

public class Meteorito extends Meteoroide{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	
	
	
	public Meteorito(String nome, int idade, Sistema sistema) {
		super();
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
			a.removeMeteorito(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removeMeteorito(this);
			
			this.sistema = sistema;
			sistema.addMeteorito(this);
		}
		
	}
}
