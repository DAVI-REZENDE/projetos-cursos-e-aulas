package main;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Corpo.Cargo;
import Corpo.Funcionario;

public class Teste {
	public static void main(String[] args ) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();
		
		Funcionario fun = new Funcionario(Cargo.DIRETOR, 20.000);
		
		Cargo cDire = Cargo.DIRETOR;
		Cargo cCai = Cargo.CAIXA;
		
		System.out.println(fun.toString());
		
		System.out.println(sdf.format(hora));
		
	}
}
