//Ler  o  ano  atual  e  o  ano  de  nascimento  de  uma  pessoa.
//Escrever  uma mensagem  que  diga  se  ela poderá ou não votar
//este ano (não é necessário considerar o mês em que a pessoa nasceu). 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual :");
		int anoAtual=sc.nextInt();
		System.out.println("Digite o seu ano de nascimentoatual :");
		int anoNascimento=sc.nextInt();
		int idade=anoAtual-anoNascimento;
		if (idade>=16) {
			System.out.println("Você está apta(o) à votar");
		} else {
			System.out.println("Você não está apta(o) à votar");

		}
		sc.close();
	}

}
