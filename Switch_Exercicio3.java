package LacosCondicionais;

import java.util.Scanner;

public class Switch_Exercicio3 {

	public static void main(String[] args) {
		
/*Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples.
O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4).
A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!*/
		
		Scanner input = new Scanner(System.in);
		
		float num1, num2;
		int codigo;
		
		
		System.out.println("\nCalculadora");
		System.out.println("\n1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = input.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = input.nextFloat();
		
		System.out.println("\nEscolha a operação de acordo com o código: ");
		codigo = input.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("\n"+num1+" + "+num2+" = "+(num1+num2));
			break;
		case 2:
			System.out.println("\n"+num1+" - "+num2+" = "+(num1-num2));
			break;
		case 3:
			System.out.println("\n"+num1+" * "+num2+" = "+(num1*num2));
			break;
		case 4:
			System.out.println("\n"+num1+" / "+num2+" = "+(num1/num2));
			break;
			default:
				System.out.println("\nOpção inválida!");
		
		}

	}

}
