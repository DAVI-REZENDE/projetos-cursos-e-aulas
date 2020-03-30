package main;

import Corpo.Cargo;
import Corpo.Funcionario;

public class Teste {
	public static void main(String[] args ) {
		
		Funcionario fun = new Funcionario(Cargo.DIRETOR, 20.000);
		
		Cargo cDire = Cargo.DIRETOR;
		Cargo cCai = Cargo.CAIXA;
		
		System.out.println(fun.toString());
		
		System.out.println(cDire.ordinal());
		System.out.println(cCai.ordinal());
		
	}
}
