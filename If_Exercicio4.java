package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio4 {

	public static void main(String[] args) {
		
/*Escreva um algoritmo em Java, que leia 3 palavras (String),
 que definem as características de um tipo de animal possível segundo o diagrama abaixo
 que deve ser lido da esquerda para a direita.*/
		
		String carac1, carac2, carac3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vertebrado ou Invertebrado?");
		carac1 = input.nextLine();
		
		if(carac1.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nAve ou Mamífero?");
			carac2 = input.nextLine();
			if(carac2.equalsIgnoreCase("ave")) {
				System.out.println("\nCarnívoro ou Onívoro?");
				carac3 = input.nextLine();
				if(carac3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÉ uma Águia!");
				}else {
					System.out.println("\nÉ uma Pomba!");
				}
			}else {
				System.out.println("\nOnívoro ou Herbívoro?");
				carac3 = input.nextLine();
				if(carac3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nÉ um Homem!");
				}else {
					System.out.println("\nÉ uma Vaca!");
				}
			}
		}else {
			System.out.println("\nInseto ou Anelídeo?");
			carac2 = input.nextLine();
			if(carac2.equalsIgnoreCase("inseto")) {
				System.out.println("\nHematófago ou Herbívoro");
				carac3 = input.nextLine();
				if(carac3.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nÉ uma Pulga!");
				}else {
					System.out.println("\nÉ uma Lagarta!");
				}
			}else {
				System.out.println("\nHematófago ou Onívoro");
				carac3 = input.nextLine();
				if(carac3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ um Sanguessuga!");
				}else {
					System.out.println("\nÉ uma Minhoca!");
				}
			}
		}
	}
}