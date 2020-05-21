package Conteudo6;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		String nome = entrada.nextLine();

		System.out.print("Insira a altura: ");
		double alturaQuadrada = Math.pow(entrada.nextDouble(), 2);

		System.out.printf("Peso mínimo: %.2f \nPeso máximo = %.2f", 20 * alturaQuadrada, 25 * alturaQuadrada);
		entrada.close();
	}
}
