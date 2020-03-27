package Exercicio02;

import Exercicio02.Pessoa;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void recebeAumento(float valorAumento) {
		this.salario += valorAumento;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
