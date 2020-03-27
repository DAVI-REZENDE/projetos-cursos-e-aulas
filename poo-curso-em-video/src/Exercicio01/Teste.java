package Exercicio01;

public class Teste {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "Masculino");
		p[1] = new Pessoa("Maria", 25, "Feminino");
		p[2] = new Pessoa("Rob", 22, "Masculino");
		
		l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
		l[1] = new Livro("O coração do mar", "Mobdic", 1000, p[1]);
		l[2] = new Livro("Bill Gates", "Bill Gates", 500, p[2]);
		
			
		l[0].detalhes();
		l[1].detalhes();
		l[2].detalhes();
	}
	
}
