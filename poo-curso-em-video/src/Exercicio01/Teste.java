package Exercicio01;

public class Teste {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "Masculino");
		p[1] = new Pessoa("Maria", 25, "Feminino");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("O coração do mar", "Mobdic", 1000, p[1]);
		l[2] = new Livro("Bill Gates", "Bill Gates", 500, p[0]);
		
			
		l[1].abrir();
		l[1].folhear(247);
		l[1].detalhes();
	}
	
}
