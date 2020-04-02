package com.davi.estacionamento;

import com.davi.estacionamento.model.Veiculo;
import com.davi.estacionamento.model.tipo.TipoCarro;

import java.sql.SQLException;

import com.davi.estacionamento.dao.VagaDao;
import com.davi.estacionamento.model.Vaga;

public class Estacionamento {
	
	
	public static void main(String[] args) throws SQLException {
	
		int numeroDeVagasNoPatio = 16;
		
		Vaga [] vagas = new Vaga[numeroDeVagasNoPatio];
		
		vagas[0] = new Vaga(1);
		vagas[1] = new Vaga(2);
		vagas[3] = new Vaga(3, new Veiculo( TipoCarro.CARRO_PEQUENO, "santana",  "BNH-1368"));
		vagas[4] = new Vaga(4, new Veiculo( TipoCarro.CARRO_PEQUENO, "corsa",  "BNH-1377"));
		vagas[5] = new Vaga(9, new Veiculo( TipoCarro.CARRO_GRANDE, "F-10",  "BNH-0077"));
		
		VagaDao vagaDao = new VagaDao();
		vagaDao.addCarroNaVaga(vagas[5]);
		vagaDao.addCarroNaVaga(vagas[4]);
		vagaDao.addCarroNaVaga(vagas[3]);
		
		//vagaDao.liberarCarroDaVaga(vagas[4]);
		
		//listar todas vagas 
		//VagaDao listarvagas = new VagaDao();
		//listarvagas.getVagas();
		

		
	}

}
