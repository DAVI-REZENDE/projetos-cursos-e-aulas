import java.util.Random;

public class SorteiaCapitão {
	
	public void sorteia() {
		
		Random aleatorio = new Random();
		int capitao = aleatorio.nextInt(3);
		switch (capitao) {
		
		case 0:
			System.out.println("O capitão de hoje e o Pedro");
			break;
		case 1:
			System.out.println("O capitão de hoje e o Jefte");
			break;
		case 2:
			System.out.println("O capitão de hoje e o Davi");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		SorteiaCapitão sdh = new SorteiaCapitão();
		
		sdh.sorteia();
		
	}
	
}
