package domain;

public class Constelacao {
	
	private String nome;
	private int idade;
	private Estrela estrela;
	
	
	public Constelacao(String nome, int idade, Estrela estrela) {
		this.nome = nome;
		this.idade = idade;
		this.estrela = estrela;
	}
	
	
	public void setEstrela(Estrela estrela) {
		this.estrela = estrela;
	}

	
}
