package Exercicio01;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totpaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totpaginas = totpaginas;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}

	//Metodos Publicos
	
	public void detalhes() {
		System.out.println("Ola " + this.getLeitor().getNome());
		System.out.println("O livro se chama " + this.getTitulo());
		System.out.println("O autor se chama " + this.getAutor());
		System.out.println("Tem um total de " + this.getTotpaginas() + " paginas");
		if(this.pagAtual > this.totpaginas) {
			System.out.println("O livro so tem " + this.getTotpaginas() + "  paginas");
		}else {
			System.out.println("Você esta na pagina " + this.getPagAtual());
		}
		if(this.isAberto() == true) {
		System.out.println("Ele esta aberto");
		}else {
			System.out.println("Ele esta fechado!");
		}
		System.out.println();
		System.out.println("____________________________________");
	}
	
	public void abrir() {
		this.setAberto(true);
	}
	
	public void fechar() {
		this.setAberto(false);
	}
	
	public void folhear(int p) {
			this.setPagAtual(p);
		}
	
	public void avancarPag() {
		this.pagAtual = this.pagAtual +1;
	}
	
	public void voltarPag() {
		this.pagAtual = this.pagAtual -1;
	}
	
	//Metodos Especiais
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotpaginas() {
		return totpaginas;
	}
	public void setTotpaginas(int totpaginas) {
		this.totpaginas = totpaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
}
