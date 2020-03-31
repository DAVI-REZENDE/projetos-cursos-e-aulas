package estacionamento;

import estacionamento.superclasses.Vaga;

public class TestaEstacionemento {
	public static void main(String[] args) {
		VagaPVeiculoGrande vaga1 = new VagaPVeiculoGrande();
		
		vaga1.setNome("Hilux");
		vaga1.detalhes();
	}

}
