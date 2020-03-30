package Corpo;

import java.sql.Date;

public class Funcionario {

	private Cargo cargo;
	private double salario;
	private Date horasDeTrabalho;
	 
	public Funcionario(Cargo cargo, double salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Date getHorasDeTrabalho() {
		return horasDeTrabalho;
	}
	public void setHorasDeTrabalho(Date horasDeTrabalho) {
		this.horasDeTrabalho = horasDeTrabalho;
	}

	@Override
	public String toString() {
		return "Funcionario [\n cargo=" + cargo + ",\n salario=" + salario + ",\n horasDeTrabalho=" + horasDeTrabalho + "\n]";
	}
	
	
	
	
}
