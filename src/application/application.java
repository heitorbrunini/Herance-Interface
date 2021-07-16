package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Normal;
import entities.Terceirizado;
import enums.typeFuncionario;

public class application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("entre com a quantidade de funcionarios: ");
		int loop = sc.nextInt();
		sc.nextLine();
		List<Funcionario> lista = new ArrayList<>();
		
		for (int i=0;i<loop;i++) {
			System.out.print("Nome do funcionario: ");
			String nome= sc.nextLine();
			System.out.print("Horas Trabalhadas: ");
			Integer horas=sc.nextInt();
			System.out.print("Valor por Hora: ");
			Double valor =sc.nextDouble();
			sc.nextLine();
			System.out.print("Tipo de Funcionario: ");	
			String tp =sc.nextLine();typeFuncionario tipo = typeFuncionario.valueOf(tp);
			if (tipo==typeFuncionario.valueOf("NORMAL")) {
				Funcionario funcionario = new Normal(nome, valor, horas, tipo);
				lista.add(funcionario);
			} else if(tipo==typeFuncionario.valueOf("TERCEIRIZADO")) {
				System.out.println("insira o valor adicional: ");
				Double valoradd=sc.nextDouble();
				sc.nextLine();
				Funcionario funcionario = new Terceirizado(nome, valor, horas, tipo,valoradd);
				lista.add(funcionario);
				
			}			
		}
		System.out.println("PAGAMENTOS:");
		for (Funcionario funcionario :lista) {
			System.out.println(funcionario);
		}
		sc.close();
		
	}
}