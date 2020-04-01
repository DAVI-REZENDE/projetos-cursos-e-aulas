/**
 * 
 */
package com.davi.estacionamento.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
	public void addCarroNaVaga(Vaga vaga) throws SQLException {
		
		ConnetionFactory factory = new ConnetionFactory();
		Connection con = ConnetionFactory.getConnection();
		Statement stm = con.createStatement();
		Calendar c = Calendar.getInstance();
		Date data = c.getTime(); 
		
		SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat hor = new SimpleDateFormat("HH:mm:ss");
		int  dia = c.get(Calendar.DATE);
		int mes = c.get(Calendar.MONTH);
		int ano = c.get(Calendar.YEAR);
		 
		String date = dt.format(data);
		String hora = hor.format(data);
		String horaNula = "0000-00-00" + " " + "00:00:00";
		String result = date + " " + hora;
		
		if(vaga.isOcupado().equals(VagaStatus.OCUPADO)) {
			
			stm.execute("insert into vagas (veiculo, placa, status, horario_entrada, horario_saida) values ('" + vaga.getCarro().getNome() +"','" + vaga.getCarro().getPlaca() + 
				"','" +vaga.getStatus()+"','" + result+"','" + horaNula + "')");	
			
		}
		
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
	
	public Vaga[] getVagas() throws SQLException {
		ConnetionFactory.getConnection();
		// SELECT * FROM vagas NO MYSQL 
		return null;
	}
	
}
