package Conteudo8;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int alunosAprovados = 0;
		int alunosReprovados = 0;
		for (int i = 0; i < 50; i++) {
			System.out.print("Insira a nota final: ");
			int notaFinal = entrada.nextInt();
			System.out.print("Insira o número total de faltas: ");
			int faltas = entrada.nextInt();

			if (notaFinal < 65 || faltas > 16) {
				System.out.println("Aluno reprovado");
				alunosReprovados++;
			} else {
				System.out.println("Aluno aprovado");
				alunosAprovados++;
			}
		}

		System.out.println("Aprovados = " + alunosAprovados);
		System.out.println("Reprovados = " + alunosReprovados);
		entrada.close();
	}
}
