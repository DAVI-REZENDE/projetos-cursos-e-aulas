import java.util.Random;

public class SorteiaCapit�o {
	
	public void sorteia() {
		
		Random aleatorio = new Random();
		int capitao = aleatorio.nextInt(3);
		switch (capitao) {
		
		case 0:
			System.out.println("O capit�o de hoje e o Pedro");
			break;
		case 1:
			System.out.println("O capit�o de hoje e o Jefte");
			break;
		case 2:
			System.out.println("O capit�o de hoje e o Davi");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		SorteiaCapit�o sdh = new SorteiaCapit�o();
		
		sdh.sorteia();
		
	}
	
}
