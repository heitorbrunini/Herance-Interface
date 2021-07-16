package entities;

import enums.typeFuncionario;
import services.serviceSalario;

public class Normal extends Funcionario implements serviceSalario {

	public Normal(String name, Double valorporhora, Integer horas,typeFuncionario tipofuncionario) {
		super(name, valorporhora, horas, tipofuncionario);
	}
	
	@Override
	public double getSalario() {
		Double salary= Horas * Valorporhora;
		return salary;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() +" - $ ");
		sb.append(getSalario());
		return sb.toString();	
	}
	

}