package Conteudo10;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// Scanner entrada = new
		// Scanner("BH\n1000000\n500000\n600000\n500000\nContagem\n300000\n150000\n200000\n100000\nIpatinga\n700000\n500000\n300000\n400000\nBetim\n600000\n450000\n50000\n400000\nZimbabue
		// de Minas\n100000\n75000\n30000\n45000\n");
		String nome = "";
		int numeroDeCidades = 0;
		int somatorioPopulacao = 0;
		int somatorioEleitores = 0;
		int cidadesComMaisMulheres = 0;
		int somatorioHomens = 0;
		int menorPopulacaoNumero = 0;
		String menorPopulacaoNome = "";
		do {
			System.out.print("Insira o nome da cidade: ");
			nome = entrada.nextLine();

			System.out.print("Insira a popula��o: ");
			int populacao = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de eleitores: ");
			int eleitores = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de homens: ");
			int homens = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira a quantidade de mulheres: ");
			int mulheres = entrada.nextInt();
			entrada.nextLine();
			// resolu��o a
			if ((homens + mulheres) != populacao) {
				System.out.println("Soma dos homens e mulheres diferente da popula��o");
			}

			// resolu��o b
			numeroDeCidades++;

			// resolu��o c
			somatorioPopulacao += populacao;

			// resolu��o d
			somatorioEleitores += eleitores;

			// resolu��o e
			if (mulheres > homens) {
				cidadesComMaisMulheres++;
			}

			// resolu��o f
			somatorioHomens += homens;

			// resolu��o g
			if (menorPopulacaoNumero > populacao || menorPopulacaoNumero == 0) {
				menorPopulacaoNumero = populacao;
				menorPopulacaoNome = nome;
			}
		} while (!nome.equals("Zimbabue de Minas"));

		// resolu��o b
		System.out.println("Quantidade total de cidades: " + numeroDeCidades);

		// resolu��o c
		System.out.println("Popula��o total: " + somatorioPopulacao);

		// resolu��o d
		System.out.printf("Percentual de eleitores: %.3f%%\n",
				((double) somatorioEleitores / somatorioPopulacao * 100));

		// resolu��o e
		System.out.println("Quantidade de cidades cuja popula��o tem mais mulheres: " + cidadesComMaisMulheres);

		// resolu��o f
		System.out.printf("Percentual de eleitores: %.2f%%\n", somatorioHomens / (double) numeroDeCidades);

		// resolu��o g
		System.out.println("Cidade com menor popula��o do estado: " + menorPopulacaoNome);
		entrada.close();
	}
}
