package domain;

public abstract class Corpo_Celeste {

	private  String nome;
	private int idade;
	private Sistema sistema;
	

	public abstract Sistema getSistema();

	public abstract void setSistema(Sistema sistema);
}
