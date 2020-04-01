package com.davi.estacionamento.model.tipo;

/**
 * Define se a vaga esta ocupada ou disponivel
 * @author gilbertopsantosjr
 *
 */
public enum VagaStatus {
	
	OCUPADO(1), DISPONIVEL(2);
	
	private int valor;
	
	VagaStatus(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
