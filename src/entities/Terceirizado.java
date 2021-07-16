package entities;

import enums.typeFuncionario;
import services.serviceSalario;

public class Terceirizado extends Funcionario implements serviceSalario {
	private Double additionalCharge;

	public Terceirizado(String name, Double valorporhora, Integer horas,typeFuncionario tipofuncionario, Double additionalCharge) {
		super(name, valorporhora, horas, tipofuncionario);
		this.additionalCharge=additionalCharge;
	}

	public Terceirizado(String nome, Double valor, Integer horas, typeFuncionario tipo) {
    }

    @Override
	public double getSalario() {
		Double sum = (additionalCharge/10)+ additionalCharge;
		Double salary= (Horas * Valorporhora)+sum;
		return salary;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() +" - $ ");
		sb.append(getSalario());
		return sb.toString();	
	}
	

}