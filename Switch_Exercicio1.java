package LacosCondicionais;

import java.util.Scanner;

public class Switch_Exercicio1 {

	public static void main(String[] args) {
		
/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6)
 e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta
 e o nome do produto que foi comprado.*/	

		Scanner input = new Scanner(System.in);
		
		int item, qtd;
		
		System.out.println("\n\tTabela de Produtos");
		System.out.println("\n1- Cachorro Quente - R$ 10.00");
		System.out.println("2- X-Salada        - R$ 15.00");
		System.out.println("3- X-Bacon         - R$ 18.00");
		System.out.println("4- Bauru           - R$ 12.00");
		System.out.println("5- Refrigerante    - R$ 8.00");
		System.out.println("6- Suco de Laranja - R$ 13.00");
		System.out.println("\nDigite o código do produto escolhido: ");
		item = input.nextInt();
		System.out.println("\nDigite a quantidade desejada: ");
		qtd = input.nextInt();
		
		switch(item) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente");
			System.out.println("Valor Total: R$ "+ qtd * 10+".00");
			break;
		case 2:
			System.out.println("\nProduto: X-Salada");
			System.out.println("Valor Total: R$ "+ qtd * 15+".00");
			break;
		case 3:
			System.out.println("\nProduto: X-Bacon");
			System.out.println("Valor Total: R$ "+ qtd * 18+".00");
			break;
		case 4:
			System.out.println("\nProduto: Bauru");
			System.out.println("Valor Total: R$ "+ qtd * 12+".00");
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante");
			System.out.println("Valor Total: R$ "+ qtd * 8+".00");
			break;
		case 6:
			System.out.println("\nProduto: Suco de Laranja");
			System.out.println("Valor Total: R$ "+ qtd * 13+".00");
			break;
			default:
				System.out.println("\nOpção inválida!");
		}
		

	}

}
