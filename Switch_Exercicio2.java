package LacosCondicionais;

import java.util.Scanner;

public class Switch_Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario;
		double novoSalario;
		
		System.out.println("\nTabela de Reajuste");
		System.out.println("\n1- Gerente    - 10%");
		System.out.println("2- Vendedor   -  7%");
		System.out.println("3- Supervisor -  9%");
		System.out.println("4- Motorista  -  6%");
		System.out.println("5- Estoquista -  5%");
		System.out.println("6- Ténico TI  -  8%");
		System.out.println("\nNome do colaborador: ");
		nome = input.nextLine();
		System.out.println("\nCódigo do cargo: ");
		cargo = input.nextInt();
		System.out.println("\nSalário: ");
		salario = input.nextFloat();
		
		switch(cargo) {
		case 1:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Gerente");
			novoSalario = salario + (salario * 0.10);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 2:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + (salario * 0.07);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 3:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + (salario * 0.09);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 4:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Motorista");
			novoSalario = salario + (salario * 0.06);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 5:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + (salario * 0.05);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 6:
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("Cargo: Técnico TI");
			novoSalario = salario + (salario * 0.08);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
			default:
				System.out.println("\nOpção inválida.");
		}
		

	}

}
