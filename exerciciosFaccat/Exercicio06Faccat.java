package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base do retângulo :");

		double base = sc.nextDouble();

		System.out.println("Digite o valor da altura do retângulo :");

		double altura = sc.nextDouble();
		
		if (base == altura) {
			System.out.println("Você digitou valores iguais, por favor digite valores distintos");
		} else {
			double area= base*altura;
			System.out.println("O valor da area corresponde a : "+area);
		}
	}

}
