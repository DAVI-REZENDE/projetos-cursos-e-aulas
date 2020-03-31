package estacionamento;

import estacionamento.superclasses.Vaga;

public class VagaPVeiculoGrande extends Vaga {
	
	public void regraDeOcupacao() {
		if(this.getCarro() == this.getCarro().CARROPEQUENO) {
			this.setOcupada(true);
		}
	}
}
