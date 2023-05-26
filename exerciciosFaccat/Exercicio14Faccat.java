package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio14Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor :");
		int valor = sc.nextInt();
		
		if(valor<10) {
			System.out.println("Não é maior que 10");
		}else if(valor == 10) {
			System.out.println("É igual a 10");
		}else {
			System.out.println("É maior que 10");
		}
		sc.close();
	}

}
