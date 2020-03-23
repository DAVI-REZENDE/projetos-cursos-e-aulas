package Aula06;

public class ControleRemoto implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	//Getters and Setters
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// Metodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado() == true) {
			System.out.println("----MENU----");
			if(this.getLigado() == true) {
				System.out.println("Esta Ligado!!");
			}else {
				System.out.println("Esta desligado!!");
			}
			
			if(this.getTocando() == true) {
				System.out.println("Tocando");
			}if(this.getTocando() == false) {
				System.out.println("Não esta tocando");
			}
			System.out.print("Volume: " + this.getVolume());
			for(int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("|");
			}
			System.out.println();
		}else {
			System.out.println("Imposivel abrir menu!");
		}
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado()) {
		System.out.println("Fechar menu...");
		}
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()==true) {
			this.setVolume(getVolume()+5);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()==true) {
			this.setVolume(getVolume()-5);
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()){
			this.setTocando(false);
		}
	}
	
	
	
}
