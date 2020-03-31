package estacionamento.superclasses;

import estacionamento.TiposCarros;

public class Vaga {
	private int numeroVaga;
	private boolean livre;
	private String statusDaVaga;
	private TiposCarros carro;
	private String nome;
	
	
	public void liberaVaga() {
		if(this.livre == true) {
			this.statusDaVaga = "Vaga ocupada";
		}else {
			this.statusDaVaga = "Vaga desocupada";
		}
	}
	
	public void detalhes() {
		
		System.out.println("O carro e " + getNome());
		if(livre == true) {
		System.out.println("A vaga " + this.getNumeroVaga() + "esta desocupada");
		}else {
			System.out.println("A vaga " + this.getNumeroVaga() + " esta ocupada");
		}
		System.out.println();
	}
	
	public int getNumeroVaga() {
		return numeroVaga;
	}
	public void setNumeroVaga(int numVaga) {
		this.numeroVaga = numVaga++;
	}
	public boolean isOcupada() {
		return livre;
	}
	public void setOcupada(boolean ocupada) {
		this.livre = ocupada;
	}
	
	 public TiposCarros getCarro() {
		return carro;
	}
	public void setCarro(TiposCarros carro) {
		this.carro = carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
