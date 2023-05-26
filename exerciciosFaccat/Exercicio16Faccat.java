//As  maçãs  custam  R$  1,30  cada  se  forem  compradas  menos  de  
//uma  dúzia, e  R$  1,00  se  forem compradas  pelo  menos  12.
//Escreva  um  programa  que  leia  o  número  de  maçãs  compradas,  
//calcule  e escreva o custo total da compra. 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {

		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de maças compradas :");
		int macas = sc.nextInt();

		if (macas < 1) {
			System.out.println("Digite um numero de maças válido, seu corrupto!");
		} else if (macas < 12) {
			double resultado = macas * 1.3;
			System.out.println("O valor a ser pago é : R$" + resultado);

		} else {
			
			System.out.println("O valor a ser pago é : R$" + macas);
		}
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Digite somente número inteiros"+e);
		}
		}

}
