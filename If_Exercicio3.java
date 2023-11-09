package LacosCondicionais;

import java.util.Scanner;

public class If_Exercicio3 {

	public static void main(String[] args) {
		
/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.*/
		
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
