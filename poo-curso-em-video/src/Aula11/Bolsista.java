package Aula11;

import Exercicio02.Aluno;

public class Bolsista extends Aluno{
	private int bolsa;

	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do Aluno: " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento realizado");
	}
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	
}
