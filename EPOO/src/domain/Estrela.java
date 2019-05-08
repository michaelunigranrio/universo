package domain;

public class Estrela extends Corpo_Celeste{
	
	private String nome;
	private int idade;
	private Sistema sistema;
	private Constelacao constelacao;
	
	
	
	public Estrela(String nome, int idade, Sistema sistema, Constelacao constelacao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.setSistema(sistema);
		this.setConstelacao(constelacao);
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
			a.removeEstrela(this);
			
		}
		
		else {
			if(this.sistema != sistema)
				this.sistema.removeEstrela(this);
			
			this.sistema = sistema;
			sistema.addEstrela(this);
		}
		
	}

	
	public Constelacao getConstelacao() {
		return constelacao;
	}


	public void setConstelacao(Constelacao constelacao) {
		this.constelacao = constelacao;
	}
	
	
}
