package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio2 {

	public static void main(String[] args) {

		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = input.nextInt();
		
		if(num % 2 == 0 && num >= 0) {
			System.out.println("\nO número "+num+" é par e positivo.");
		}else if(num % 2 == 0 && num < 0) {
			System.out.println("\nO número "+num+" é par e negativo.");
		}else if(num % 2 != 0 && num < 0) {
			System.out.println("\nO número "+num+" é ímpar e negativo.");
		}else {
			System.out.println("\nO número "+num+" é ímpar e positivo.");
		}
	}

}
