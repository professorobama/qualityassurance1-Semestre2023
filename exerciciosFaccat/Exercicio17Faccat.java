/*Ler  as  notas  da  1a.  e  2a.  avaliações  de  um  aluno.
Calcular  a  média aritmética  simples  e  escrever uma 
mensagem que diga se o aluno foi ou não aprovado (considerar 
que nota igual ou maior que 6 o aluno é aprovado). 
Escrever também a média calculada.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {

		try {
			
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da 1º Nota :");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o valor da 2º Nota :");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;

		if ((media < 0) || (media > 10)) {
			System.out.println("O programa aceita somente números entre 0 e 10, inclusive!");
		} else if (media >= 6) {
			System.out.println("Aluno(a) aprovado(a) com sucesso. Sua média foi :" + media);
		} else {
			System.out.println("Aluno(a) reprovado(a). Sua média foi :" + media);
		}
		sc.close();
		} catch (Exception e) {
			System.out.println("Caro amigo(a), não sei se percebeu, mas não aceitamos caracteres para efetuar operações matemáticas"+e);
		}
	}
}
