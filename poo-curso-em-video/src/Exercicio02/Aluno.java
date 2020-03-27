package Exercicio02;

import Exercicio02.Pessoa;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public void cancelarMatricula(){
		this.matricula = 0;
		System.out.println("Matricula cancelada!");
	}
	
	public int getMatricula() {
		return matricula;
	}
	private void setMatricula(int matricula) {
		this.matricula++;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
