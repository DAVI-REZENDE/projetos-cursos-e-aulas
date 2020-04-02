/**
 * 
 */
package com.davi.estacionamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	 * @throws SQLException 
	 */
	
	public String getDataFormatada() {
		SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		Date data = c.getTime(); 
		
		String date = dt.format(data);
		return date;
		
	}
	
	public void addCarroNaVaga(Vaga vaga) throws SQLException {
		
		String sql = "insert into vagas (numero_vaga, veiculo, placa, status, horario_entrada, horario_saida) values ( ?,?,?,?,?'" + null + "')" ;
		
		ConnetionFactory factory = new ConnetionFactory();
		Connection con = ConnetionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, vaga.getNumeroVaga());
		ps.setString(2, vaga.getCarro().getNome());
		ps.setString(3, vaga.getCarro().getPlaca());
		ps.setString(4, vaga.getStatus().name());
		ps.setString(5, this.getDataFormatada());
		
		
		// sql para inserir no banco 
	}
	
	/**
	 * atualiza o status da vaga e UPDATE no banco 
	 * @param vaga
	 * @throws SQLException 
	 */
	public void liberarCarroDaVaga(Vaga vaga) throws SQLException {
		//ConnetionFactory.getConnection();
		Calendar c = Calendar.getInstance();

		Date data = c.getTime(); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat hor = new SimpleDateFormat("HH:mm:ss");
		 
		 String date = sdf.format(data);
		String hora = hor.format(data);
		
		System.out.println(date + " " + hora);
		    
		// mudar a vaga para DISPONIVEL no banco 
		vaga.setCarro(null); // liberar o espaco para o proximo carro 
		vaga.setStatus(VagaStatus.DISPONIVEL);
		vaga.setEntrada(null);
		// registra a data de saida
		vaga.setSaida(new Date());
		//sql para atualizar no banco
	}
	
	public void getVagas() throws SQLException {
		ConnetionFactory connectionFactory = new ConnetionFactory();
		Connection con = connectionFactory.getConnection();
		PreparedStatement stm = con.prepareStatement("select * from vaga");

		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("id");
			Integer numero_vaga = rst.getInt("numero_vaga");
			String Veiculo = rst.getString("veiculo");
			String Placa = rst.getString("placa");
			String status = rst.getString("status");
			String horario_entrada = rst.getString("horario_entrada");
			String horario_saida = rst.getString("horario_saida");
			
			System.out.println(id + " | " + numero_vaga + " | " + Veiculo + " | " + Placa + " | " + status + " | " + horario_entrada + " | " + horario_saida );
			
		}
		
		con.close();

	}
	
}
