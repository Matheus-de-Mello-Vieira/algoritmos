package Conteudo6;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome da primeira equipe: ");
		String nome1 = entrada.nextLine();

		System.out.print("Insira os sets ganhos pela primeira equipe: ");
		int sets1 = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Insira o nome da segunda equipe: ");
		String nome2 = entrada.nextLine();

		System.out.print("Insira os sets ganhos pela segunda equipe: ");
		int sets2 = entrada.nextInt();
		entrada.nextLine();

		int diferenca = sets1 - sets2;
		if (diferenca >= 2) {
			System.out.printf("Pontos %s = %d \nPontos %s = %d", nome1, 3, nome2, 0);
		} else if (diferenca == 1) {
			System.out.printf("Pontos %s = %d \nPontos %s = %d", nome1, 2, nome2, 1);
		} else if (diferenca == -1) {
			System.out.printf("Pontos %s = %d \nPontos %s = %d", nome1, 1, nome2, 2);
		} else if (diferenca <= -1) {
			System.out.printf("Pontos %s = %d \nPontos %s = %d", nome1, 0, nome2, 3);

			entrada.close();
		}
	}
}
