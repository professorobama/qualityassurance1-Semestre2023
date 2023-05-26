/*5) Escreva um algoritmo para ler um valor (do teclado) e escrever
(na tela) o seu sucessor.*/
package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio5_1Faccat {

	public static void main(String[] args) {
		
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um numero :");
			
			int numero=sc.nextInt();
			
			int resultado = numero+1;
			
			System.out.println("O sucessor do numero "+numero +" é : "+resultado);
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Favor, inserir somente numeros"+ " "+ e);
		}		
	}
}
