package entities;


import enums.typeFuncionario;

public abstract class Funcionario {
	protected typeFuncionario tipofuncionario;
	private String 	Name;
	protected Double Valorporhora;
	protected Integer Horas;
	
	public Funcionario(){}
	
	public Funcionario(String name, Double valorporhora, Integer horas,typeFuncionario tipofuncionario ) {
		Name = name;
		Valorporhora = valorporhora;
		Horas = horas;
		this.tipofuncionario = tipofuncionario;
	}
	
	public typeFuncionario getType() {
		return tipofuncionario;
	}
	

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Double getValorporhora() {
		return Valorporhora;
	}
	public void setValorporhora(Double valorporhora) {
		Valorporhora = valorporhora;
	}
	public Integer getHoras() {
		return Horas;
	}
	public void setHoras(Integer horas) {
		Horas = horas;
	}
	

}