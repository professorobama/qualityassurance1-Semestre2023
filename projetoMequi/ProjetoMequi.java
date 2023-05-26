package projetoMequi;

import java.util.Scanner;

public class ProjetoMequi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("----PROJETO MEQUI----");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---");
		System.out.println("");
		System.out.println("*******Cardápio*******");
		System.out.println("");
		System.out.println("1 - Lançamentos");
		System.out.println("2 - Brabos do Mequi");
		System.out.println("3 - Sanduiches de Carne Bovina");
		System.out.println("4 - Família Tasty");
		System.out.println("5 - Sanduiches de Frango");
		System.out.println("6 - MC Lanche Feliz");
		System.out.println("7 - Méqui 1000 ");
		System.out.println("8 - Acompanhamentos");
		System.out.println("9 - Sobremesas");
		System.out.println("10 - Bebidas Frias");
		System.out.println("11 - Café da Manhã");
		System.out.println("12 - Bebidas Quentes");
		System.out.println("13 - MC Ofertas");
		System.out.println("14 - Méqui Box ");
		System.out.println("15 - MC Café ");

		int opcaoMenu1 = sc.nextInt();
		switch (opcaoMenu1) {
		case 1:
			System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
			System.out.println("");
			System.out.println("*******LANÇAMENTOS*******");
			System.out.println("");
			System.out.println("1 - McCrispy Chicken Legend");
			System.out.println("2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
			System.out.println("3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
			System.out.println("4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
			System.out.println("");
			System.out.println("--SELECIONE UMA OPÇÃO---");
			System.out.println("");
			int opcaoMenuSubMenu1 = sc.nextInt();
			switch (opcaoMenuSubMenu1) {
			case 1:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
				System.out.println("");
				System.out.println("**1 - McCrispy Chicken Legend**");
				System.out.println("");
				System.out.println("Caloria : 926Kcal");
				System.out.println(
						"Composto por pão tipo brioche com batata, molho do CBO, cebola crispy, bacon em fatias, alface americana, queijo sabor cheddar e carne 100% de peito de frango, temperada e empanada.");
				break;

			}
			break;

		default:
			System.out.println("Não existe a opção digitada pelo usuário");
			break;
		}
	}

}
