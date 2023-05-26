package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade total de eleitores de um municipio :");
		int eleitores= sc.nextInt();
		System.out.println("Digite a quantidade total de eleitores que votaram em branco :");
		int votosBranco= sc.nextInt();
		System.out.println("Digite a quantidade total de eleitores que votaram em nulo :");
		int votosNulo= sc.nextInt();
		System.out.println("Digite a quantidade total de eleitores que votaram válidos :");
		int votosValidos= sc.nextInt();
		double percentualVotosBranco=votosBranco*100/eleitores;
		double percentualVotosNulo=votosNulo*100/eleitores;
		double percentualVotosValidos=votosValidos*100/eleitores;
		
		System.out.println("A porcentagem correspondente aos votos brancos é :"+percentualVotosBranco +"%");
		System.out.println("A porcentagem correspondente aos votos nulos é :"+percentualVotosNulo+"%");
		System.out.println("A porcentagem correspondente aos votos válidos é :"+percentualVotosValidos+"%");
		
	}

}
