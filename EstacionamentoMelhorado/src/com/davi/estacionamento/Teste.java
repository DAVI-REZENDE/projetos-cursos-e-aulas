package com.davi.estacionamento;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.davi.estacionamento.dao.VagaDao;
import com.davi.estacionamento.model.Vaga;
import com.davi.estacionamento.model.Veiculo;
import com.davi.estacionamento.model.tipo.TipoCarro;

public class Teste {
	
	 public static void main(String[] args) throws ParseException, SQLException {
	        
		 Veiculo carroP = new Veiculo(TipoCarro.CARRO_PEQUENO, "Corsa", "1233-qwe");
	     Vaga vaga = new Vaga(1, carroP);
	     VagaDao vaga1 = new VagaDao();
	        
	     //vaga1.addCarroNaVaga(vaga);
	     //vaga1.liberarCarroDaVaga(vaga);
	     vaga1.getDataFormatada();
	     System.out.println(vaga.getStatus().name());
	         
	        
	    }

}
