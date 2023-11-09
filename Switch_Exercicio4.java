package LacosCondicionais;

import java.util.Scanner;

public class Switch_Exercicio4 {

	public static void main(String[] args) {
		
/*Desenvolva um algoritmo em Java para uma conta bancária. 
O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3)
e o valor a ser depositado ou sacado (somente nas opções 2 e 3).Considere que um saque só pode ser realizado caso haja saldo suficiente. 
Ao final de cada operação, exiba o novo Saldo na tela.
A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!*/
	
		Scanner input = new Scanner(System.in);
		
		int operacao;
		float valor, saldo = 1000;
		
		System.out.println("Operações");
		System.out.println("\n1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("\nEscolha a operação desejada de acordo com o código: ");
		operacao = input.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("\nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("\nValor a sacar: ");
			valor = input.nextFloat();
			if(valor > saldo) {
				System.out.println("\nOperação - Saque");
				System.out.println("\nSaldo Insuficiente!");
			}else {
				System.out.println("\nOperação - Saque");
				System.out.printf("\nNovo Saldo: R$ %.2f", saldo - valor);
			}
			break;
		case 3:
			System.out.println("\nValor a depositar: ");
			valor = input.nextFloat();
			System.out.println("\nOperação - Depósito");
			System.out.printf("\nNovo Saldo: R$ %.2f", saldo + valor);
			break;
			default:
				System.out.println("\nOperação inválida!");
		}
		
	}

}
