package Conteudo8;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int cidadesAcima1milhao = 0;
		int maismulheres = 0;
		int menorPopulacao = 0;
		String cidadeComMenorPopulacao = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o nome da cidade: ");
			String nome = entrada.nextLine();

			System.out.print("Insira a população: ");
			int populacao = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de eleitores: ");
			int quantidadeDeEleitores = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de mulheres: ");
			int quantidadeMulher = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de homens: ");
			int quantidadeHomem = entrada.nextInt();
			entrada.nextLine();

			if (quantidadeMulher + quantidadeHomem != populacao) {
				System.out.println("A quantidade da soma de homens e mulher diferiu da população");
			}
			System.out.printf("Percentual de eleitores: %.2f%%\n", (quantidadeDeEleitores / (double) populacao) * 100);

			if (populacao > 1000000) {
				cidadesAcima1milhao++;
			}

			if (quantidadeMulher > quantidadeHomem) {
				maismulheres++;
			}

			if (menorPopulacao > populacao || menorPopulacao == 0) {
				cidadeComMenorPopulacao = nome;
				menorPopulacao = populacao;
			}
		}
		System.out.println("Cidades com a população de 1 milhão: " + cidadesAcima1milhao);
		System.out.println("Cidades com mais mulheres que homem: " + maismulheres);
		System.out.println("Cidade de menor população: " + cidadeComMenorPopulacao);
		entrada.close();
	}
}
