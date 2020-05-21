package Conteudo6;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número de faltas: ");
		int faltas = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Insira a nota da primeira prova: ");
		double prova1 = entrada.nextDouble();

		System.out.print("Insira a nota da segunda prova: ");
		double prova2 = entrada.nextDouble();

		System.out.print("Insira a nota da terceira prova: ");
		double prova3 = entrada.nextDouble();

		System.out.print("Insira a nota do trabalho: ");
		double trabalho = entrada.nextDouble();

		System.out.print("Insira a idade: ");
		int idade = entrada.nextInt();
		double nota = 0;

		if (prova1 > prova2) {
			nota += prova1;
		} else {
			nota += prova2;
			if (prova1 > prova3) {
				nota += prova1;
			} else {
				nota += prova3;
			}
		}

		nota /= 2.0;

		if (faltas <= 5) {
			nota *= 3;
		} else if (faltas <= 10) {
			nota *= 2;
		}

		if (idade <= 17) {
			nota += trabalho * 1;
		} else if (idade <= 50) {
			nota += trabalho * 2;
		} else {
			nota += trabalho * 3;
		}

		if (nota <= 50) {
			System.out.println("Reprovado");
		} else if (nota < 70) {
			System.out.println("Regular");
		} else if (nota < 80) {
			System.out.println("Bom");
		} else if (nota < 90) {
			System.out.println("Muito bom");
		} else {
			System.out.println("Excelente");
		}
		entrada.close();
	}

}
