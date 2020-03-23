package Aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private  float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome,String nacio,int idade, float altura, float peso, String catego, int vito, int derro, int empa) {
	this.nome = nome;
	this.nacionalidade = nacio;
	this.idade = idade;
	this.altura = altura;
	this.setPeso(peso);
	this.vitorias = vito;
	this.derrotas = derro;
	this.empates = empa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if(this.peso<52.2) {
			this.categoria = "Invalido";
		}else if(this.peso<= 70.3){
			this.categoria = "Leve";
		}else if(this.peso >= 83.9) {
			this.categoria = "Medio";
		}else if(this.peso >= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
