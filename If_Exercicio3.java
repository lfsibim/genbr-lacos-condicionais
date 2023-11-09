package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		nome = input.nextLine();
		System.out.println("\nDigite a Idade do doador: ");
		idade = input.nextInt();
		System.out.println("\nPrimeira doação de sangue? ");
		primeiraDoacao = input.nextBoolean();
		
		if(idade <= 17 || idade >= 70) {
			System.out.println("\n"+nome+" não está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && primeiraDoacao == true) {
			System.out.println("\n"+nome+" não está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println("\n"+nome+" está apto(a) para doar sangue!");
		}else {
			System.out.println("\n"+nome+" está apto(a) para doar sangue!");
		}
		
	}

}
