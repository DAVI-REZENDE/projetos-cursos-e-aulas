package com.davi.estacionamento.model.tipo;

/**
 * 
 * @author gilbertopsantosjr
 *
 */
public enum TipoCarro  {
	
	// por padrao, constantes sao UPPER_CASE 
	CARRO_PEQUENO(0),
	//com um _ para dividir as palavras 
	CARRO_GRANDE(1),
	CAMINHAO(2);
	
	private int valor;
	
	TipoCarro(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
}
