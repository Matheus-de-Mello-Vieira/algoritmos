package Conteudo4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author mello
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int colunas = 79;
		int valores[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o " + (i + 1) + "ª valor: ");
			valores[i] = entrada.nextInt();
		}

		System.out.println("===============================================================================");
		System.out.println("                 Quantidade de Poluente Emitido x Valor de Multa               ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(" Até " + valores[0] + " multa de R$ " + valores[2]);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(" Entre " + valores[0] + " e " + valores[1] + " multa de R$ " + valores[3]);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(" Acima de " + valores[1] + " multa de R$ " + valores[4] + " por poluente emitido");
		System.out.println("===============================================================================");
		entrada.close();
	}
}
