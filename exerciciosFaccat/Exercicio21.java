package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicio=24;
		int horaFinal = 24;

		while ((horaInicio < 0) || (horaInicio > 23)) {
			System.out.println("Digite o horário inicial da partida de Xadrez :");
			horaInicio = sc.nextInt();
		}
		while ((horaFinal < 0) || (horaFinal > 23)) {
			System.out.println("Digite o horário final da partida de Xadrez :");
			horaFinal = sc.nextInt();
		}
		
		int quantidadeHorasJogo = horaFinal - horaInicio;
		if (quantidadeHorasJogo < 0) {
			quantidadeHorasJogo = quantidadeHorasJogo + 24;
			System.out.println("A quantidade de horas jogadas corresponde a :" + quantidadeHorasJogo + " horas");
		} else if (quantidadeHorasJogo == 0) {
			System.out.println("Fim do jogo, a duração chegou a 24 horas");
		} else {
			System.out.println("A quantidade de horas jogadas corresponde a :" + quantidadeHorasJogo + " horas");
		}

	}

}
