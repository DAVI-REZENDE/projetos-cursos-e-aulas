package estacionamento.tipos;

import estacionamento.TiposCarros;
import estacionamento.superclasses.Carro;
import estacionamento.superclasses.Vaga;

public class VagaPVeiculoPequeno extends Vaga {
	
	
	public void RegraDeOcupacao() {
		if(this.getCarro() == this.getCarro().CARROPEQUENO) {
			this.setOcupada(true);
		}
	}
	
	
}
