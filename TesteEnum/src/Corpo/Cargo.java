package Corpo;

public enum Cargo {
	OPERADOR(1),CAIXA(2),SUPERVISOR(3),DIRETOR(4);

	private int valor;
	
	Cargo(int i) {
		this.valor = i;
	}
	
	public int getValor() {
		return this.valor;
	}
}
 