package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio1 {

	public static void main(String[] args) {
		
/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/		
		
		int A, B, C, soma;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		A = input.nextInt();
		System.out.println("\nDigite o valor de B: ");
		B = input.nextInt();
		System.out.println("\nDigite o valor de C: ");
		C = input.nextInt();
		
		soma = A + B;
		
		if(soma > C) {
			System.out.println("\n"+A+" + "+B+" = "+soma+" > "+C);
			System.out.println("\nA Soma de A + B é Maior que C.");
		}else if(soma < C) {
			System.out.println("\n"+A+" + "+B+" = "+soma+" < "+C);
			System.out.println("\nA Soma de A + B é Menor que C.");
		}else {
			System.out.println("\n"+A+" + "+B+" = "+soma+" = "+C);
			System.out.println("\nA Soma de A + B é igual a C.");
		}
		

	}

}
