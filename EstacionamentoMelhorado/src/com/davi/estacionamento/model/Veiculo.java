package com.davi.estacionamento.model;

import com.davi.estacionamento.model.tipo.TipoCarro;

public class Veiculo{
	
	private TipoCarro tipo;
	private String nome;
	private String placa;
	
	public Veiculo() {
		
	}
	
	public Veiculo(TipoCarro tipo, String nome, String placa) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.placa = placa;
	}

	public TipoCarro getTipo() {
		return tipo;
	}
	public void setTipo(TipoCarro tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
