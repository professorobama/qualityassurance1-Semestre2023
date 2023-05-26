package exemplos;

import java.util.Scanner;

public class ExemploSwitchCase1 {

	public static void main(String[] args) {
		System.out.println("Digite um número :");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Chocolate");
			System.out.println("");
			System.out.println("Você escolheu a opção chocolate");
			System.out.println("Selecione uma opção");
			System.out.println("");
			System.out.println("1 - Chocolate Branco");
			System.out.println("2 - Chocolate ao Leite");
			System.out.println("3 - Chocolate Amargo");
			
			int subNumero = sc.nextInt();
			
			switch (subNumero) {
			case 1:
				System.out.println("Selecione uma opção");
				System.out.println("");
				System.out.println("1 - Chocolate Branco");
				break;
			case 2:
				System.out.println("Selecione uma opção");
				System.out.println("");
				System.out.println("2 - Chocolate ao Leite");
				break;
			case 3:
				System.out.println("Selecione uma opção");
				System.out.println("");
				System.out.println("3 - Chocolate Amargo");
				break;

			default:
				break;
			}
			break;
		case 2:
			System.out.println("Pirulito");
			break;
		case 3:
			System.out.println("Pipoca");
			break;
		case 4:
			System.out.println("Chiclete");
			break;
		case 5:
			System.out.println("Salgadinho");
			break;
		default:
			System.out.println("Vai jantar");
			break;
		}
	}

}
