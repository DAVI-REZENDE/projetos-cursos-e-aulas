/**
 * 
 */
package com.davi.estacionamento.dao;

import java.util.Date;

import com.davi.estacionamento.model.Vaga;
import com.davi.estacionamento.model.tipo.VagaStatus;
import com.davi.estacionamento.utils.ConnetionFactory;

/**
 * @author gilbertopsantosjr
 * Dao  significa  Data Access Object é um padrao universal 
 * isso significa que essa classe é especifica para operar metodos de acesso ao banco de dados
 * cada modelo deve ter sua propria classe. essa e para class vaga
 */
public class VagaDao {

	/**
	 * adiciona uma vaga ao banco de dados 
	 * vaga contem carro 
	 * @param vaga
	 */
	public void addCarroNaVaga(Vaga vaga) {
		
		ConnetionFactory.getConnection();
		
		if(vaga.isOcupado().equals(VagaStatus.OCUPADO)) {
			// so é possivel adicionar se a vaga possuir um carro
		}
		// sql para inserir no banco 
	}
	
	/**
	 * atualiza o status da vaga e UPDATE no banco 
	 * @param vaga
	 */
	public void liberarCarroDaVaga(Vaga vaga) {
		ConnetionFactory.getConnection();
		
		// mudar a vaga para DISPONIVEL no banco 
		vaga.setCarro(null); // liberar o espaco para o proximo carro 
		vaga.setStatus(VagaStatus.DISPONIVEL);
		vaga.setEntrada(null);
		// registra a data de saida
		vaga.setSaida(new Date());
		//sql para atualizar no banco
	}
	
	public Vaga[] getVagas() {
		ConnetionFactory.getConnection();
		// SELECT * FROM vagas NO MYSQL 
		return null;
	}
	
}
