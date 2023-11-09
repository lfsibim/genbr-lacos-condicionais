package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio4 {

	public static void main(String[] args) {
		
		String carac1, carac2, carac3;
		Scanner input = new Scanner(System.in);
		
		
		carac1 = input.nextLine();
		carac2 = input.nextLine();
		carac3 = input.nextLine();
		
		if(carac1.equalsIgnoreCase("vertebrado")) {
			if(carac2.equalsIgnoreCase("ave")) {
				if(carac3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÁguia");
				}else {
					System.out.println("\nPomba");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("vertebrado")) {
			if(carac2.equalsIgnoreCase("mamífero")) {
				if(carac3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nHomem");
				}else {
					System.out.println("\nVaca");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("invertebrado")) {
			if(carac2.equalsIgnoreCase("inseto")) {
				if(carac3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nPulga");
				}else {
					System.out.println("\nLagarta");
				}
			}
		}
		
		if(carac1.equalsIgnoreCase("invertebrado")) {
			if(carac2.equalsIgnoreCase("anelídeo")) {
				if(carac3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nSanguessuga");
				}else {
					System.out.println("\nMinhoca");
				}
			}
		}

	}

}
