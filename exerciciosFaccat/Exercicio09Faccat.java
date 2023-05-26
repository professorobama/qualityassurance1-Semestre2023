package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário atual :");
		float salario =sc.nextFloat();
		System.out.println("Digite o valor da porcentagem de reajuste :");
		float reajuste =sc.nextFloat();
		
		float valorRealDoReajuste = reajuste*salario/100;
		float salarioFinal = salario +valorRealDoReajuste;
		
		System.out.printf("O novo salário com reajuste é : R$ %.3f",salarioFinal);
		sc.close();
	}
}
