package com.davi.estacionamento;

import com.davi.estacionamento.model.Veiculo;
import com.davi.estacionamento.model.tipo.TipoCarro;

import javax.swing.JOptionPane;

import com.davi.estacionamento.dao.VagaDao;
import com.davi.estacionamento.model.Vaga;

public class Estacionamento {
	
	
	public static void main(String[] args) {
	
		int numeroDeVagasNoPatio = 16;
		
		Vaga [] vagas = new Vaga[numeroDeVagasNoPatio];
		
		vagas[0] = new Vaga(1);
		vagas[1] = new Vaga(2);
		vagas[3] = new Vaga(3, new Veiculo( TipoCarro.CARRO_PEQUENO, "santana",  "BNH-1368"));
		vagas[4] = new Vaga(4, new Veiculo( TipoCarro.CARRO_PEQUENO, "corsa",  "BNH-1377"));
		vagas[5] = new Vaga(9, new Veiculo( TipoCarro.CARRO_GRANDE, "F-10",  "BNH-0077"));
		
		VagaDao vagaDao = new VagaDao();
		
		vagaDao.addEntrada(vagas[0]);
		vagaDao.addEntrada(vagas[4]);
		vagaDao.addEntrada(vagas[3]);
		
		vagaDao.liberarCarroDaVaga(vagas[4]);
		
		//listar todas vagas 
		Vaga [] vagasRegistradas = vagaDao.getVagas();
		
		for (int i = 0; i < vagasRegistradas.length; i++) {
			Vaga vaga = vagasRegistradas[i];
			System.out.println(vaga);
		}
		
	
	}

}
