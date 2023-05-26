package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas trabalhadas em um mês :");
		int quantidadeHorastrabalhadas = sc.nextInt();

		System.out.println("Digite o valor recebido por cada hora trabalhada :");
		float valorHora = sc.nextFloat();

		if (quantidadeHorastrabalhadas < 161) {
			float salarioFinal = quantidadeHorastrabalhadas * valorHora;
			System.out.println("O valor a ser recebido é : R$" + salarioFinal);
		} else {
			float salarioFinal = (160 * valorHora)+(valorHora + valorHora*50/100);
			System.out.printf("O valor a ser recebido é : R$  %.2f" , salarioFinal);
		}
	}

}
