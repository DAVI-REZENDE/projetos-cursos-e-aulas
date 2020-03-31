package main;

import Corpo.Cargo;
import Corpo.Funcionario;

public class Teste {
	public static void main(String[] args ) {
		
		Funcionario direotr = new Funcionario(Cargo.DIRETOR, (float) 20.000);
		Funcionario caixa = new Funcionario(Cargo.CAIXA, (float) 10.000);
		
		System.out.println(direotr.toString());
		System.out.println(caixa.toString());
		
	}
}
