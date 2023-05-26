package exemplos;

import java.util.Scanner;

public class ExemploLacoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você deseja saber da tabuada :");
		int valor=sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + " * " + i + " = "+ valor*i);
		}

	}

}

