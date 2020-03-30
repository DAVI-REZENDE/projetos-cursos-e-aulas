package Corpo;

public enum Cargo {
	OPERADOR(1),CAIXA(3),SUPERVISOR(5),DIRETOR(10);

	private int valor;
	
	Cargo(int i) {
		this.valor = i;
	}
	
	public int getValor() {
		return this.valor;
	}
}
 