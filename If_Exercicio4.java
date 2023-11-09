package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio4 {

	public static void main(String[] args) {
		
/*Escreva um algoritmo em Java, que leia 3 palavras (String),
 que definem as características de um tipo de animal possível segundo o diagrama abaixo
 que deve ser lido da esquerda para a direita.*/
		
		String carac1, carac2, carac3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira característica: ");
		carac1 = input.nextLine();
		System.out.println("\nDigite a segunda característica: ");
		carac2 = input.nextLine();
		System.out.println("\nDigite a terceira característica: ");
		carac3 = input.nextLine();
		
		if(carac1.equalsIgnoreCase("vertebrado")) {
			if(carac2.equalsIgnoreCase("ave")) {
				if(carac3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÉ uma Águia");
				}else {
					System.out.println("\nÉ uma Pomba");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("vertebrado")) {
			if(carac2.equalsIgnoreCase("mamífero")) {
				if(carac3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ um Homem");
				}else {
					System.out.println("\nÉ uma Vaca");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("invertebrado")) {
			if(carac2.equalsIgnoreCase("inseto")) {
				if(carac3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ uma Pulga");
				}else {
					System.out.println("\nÉ uma Lagarta");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("invertebrado")) {
			if(carac2.equalsIgnoreCase("anelídeo")) {
				if(carac3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ um Sanguessuga");
				}else {
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}

	}

}
