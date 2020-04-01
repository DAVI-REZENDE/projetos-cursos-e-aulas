package com.davi.estacionamento.model;

import java.util.Date;

import com.davi.estacionamento.model.tipo.VagaStatus;

public class Vaga {
	
	// uma vaga possui um numero de identificacao
	private int numeroVaga;
	
	// a vaga possui um status
	private VagaStatus status;
	
	// uma vaga so conter apenas 1 carro 
	private Veiculo carro;
	
	private Date entrada;
	
	private Date saida;
	
	// construtor padrao e uma boa pratica, manter
	public Vaga() {
		
	}
	
	// construtor 02  - sobrecarga 
	// o minimo para se criar uma vaga e seu numero e seu status 
	public Vaga(int numero) {
		this.numeroVaga = numero;
		// por padrao , quando a vaga e criada , ela ja nasce disponivel
		this.status = VagaStatus.DISPONIVEL;
	}
	
	// construtor 03  - sobrecarga 
	public Vaga (int numero, Veiculo carro) {
		this.numeroVaga = numero;
		this.carro = carro;
		// por padrao , quando a vaga e criada com um carro , ela ja nasce ocupada
		this.status = VagaStatus.OCUPADO;
		// pega a data da entrada
		this.entrada = new Date();
	}
	
	public VagaStatus isOcupado() {
		// se a vaga possui uma instancia de carro, entao ela esta ocupado
		return carro != null ? VagaStatus.OCUPADO : VagaStatus.DISPONIVEL;
	}

	public int getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(int numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public VagaStatus getStatus() {
		return status;
	}

	public void setStatus(VagaStatus status) {
		this.status = status;
	}

	public Veiculo getCarro() {
		return carro;
	}

	public void setCarro(Veiculo carro) {
		this.carro = carro;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}
	
	
	
}
