/**
 * 
 */
package com.davi.estacionamento.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
/**
 * @author davir
 *
 */
public class VagaDao {

	/**
	 * adiciona uma vaga ao banco de dados 
	 * vaga contem carro 
	 * @param vaga
	 * @throws SQLException 
	 */

	SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	ConnetionFactory factory = new ConnetionFactory();

	
	public String getDataFormatada() {
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime(); 
		return  dt.format(data);
		
	}
	
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}
	

	public void addCarroNaVaga(Vaga vaga) throws SQLException {
		
		try {
		String sql = "insert into vagas (numero_vaga, veiculo, placa, status, horario_entrada, horario_saida) values (?,?,?,?,?,?)" ;
		
		Connection con = ConnetionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		 
		ps.setInt(1, vaga.getNumeroVaga());
		ps.setString(2, vaga.getCarro().getNome());
		ps.setString(3, vaga.getCarro().getPlaca());
		ps.setString(4, vaga.getStatus().name());
		ps.setTimestamp(5, getCurrentTimeStamp());
		ps.setTimestamp(6, null);
		
		ps.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	/**
	 * atualiza o status da vaga e UPDATE no banco 
	 * @param vaga
	 * @throws SQLException 
	 */
	public void liberarCarroDaVaga(Vaga vaga) throws SQLException {
		ConnetionFactory.getConnection();
		// mudar a vaga para DISPONIVEL no banco 
		vaga.setCarro(null); // liberar o espaco para o proximo carro 
		vaga.setStatus(VagaStatus.DISPONIVEL);
		vaga.setEntrada(null);
		// registra a data de saida
		vaga.setSaida(getCurrentTimeStamp());
		
		String sql = "UPDATE vaga SET veiculo= ?, placa= ?, status= ?,horario_saida WHERE numero_vaga = ?";
		
		try(	Connection conn = factory.getConnection();
				PreparedStatement stm = conn.prepareStatement(sql)
				) {
	
			stm.setString(1, vaga.getCarro().getNome());
			
			stm.executeUpdate();	
			} catch (SQLException e) {
			}
		}
	


	public void getVagas() throws SQLException {
		Connection conn = ConnetionFactory.getConnection();
		
		Statement stm = conn.createStatement();
		stm.execute("select * from vagas");
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("id");
			Integer numero_vaga = rst.getInt("numero_vaga");
			String veiculo = rst.getString("veiculo");
			String placa = rst.getString("placa");
			String status = rst.getString("status");
			Timestamp horario_entrada = rst.getTimestamp("horario_entrada");
			Timestamp horario_saida = rst.getTimestamp("horario_saida");
			System.out.println(id + " | " + numero_vaga + " | " + veiculo + " | " + placa + " | " +  status + " | " + 
			horario_entrada + " | " + horario_saida);
		}
	}
	

	
}
