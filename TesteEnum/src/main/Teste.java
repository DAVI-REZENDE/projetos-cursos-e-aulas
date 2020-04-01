package main;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Corpo.Cargo;
import Corpo.Funcionario;

public class Teste {
	public static void main(String[] args ) {
		
<<<<<<< HEAD
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();
		
		Funcionario fun = new Funcionario(Cargo.DIRETOR, 20.000);
		
		Cargo cDire = Cargo.DIRETOR;
		Cargo cCai = Cargo.CAIXA;
		
		System.out.println(fun.toString());
		
		System.out.println(sdf.format(hora));
=======
		Funcionario direotr = new Funcionario(Cargo.DIRETOR, (float) 20.000);
		Funcionario caixa = new Funcionario(Cargo.CAIXA, (float) 10.000);
		
		System.out.println(direotr.toString());
		System.out.println(caixa.toString());
>>>>>>> 232ef787e605f396aee4ae79ff747dcff5f0829e
		
	}
}
