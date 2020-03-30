package Aula11;

public class ProjetoMain {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		
		v1.setNome("Juventus");
		v1.setIdade(15);
		v1.setSexo("Macho");
		
		System.out.println(v1.toString());
	}
	
}
