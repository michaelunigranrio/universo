package domain;

public abstract class Meteoroide extends Corpo_Celeste {

	//private String nome;
	//private int idade;
	//private Sistema sistema;
	private String tipo;
	

	public abstract Sistema getSistema();

	public abstract void setSistema(Sistema sistema);
}
