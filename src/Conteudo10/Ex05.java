package Conteudo10;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int quantidadeDePessoas = 0;
		int quantidadeDeMulheres = 0;
		int quantidadeDeHomens = 0;
		double somatorioAlturaHomens = 0;
		int quantiadeDeMulheresComPesoMenorQue60 = 0;

		double altura = 0, peso = 0;
		char sexo = 'A';
		do {
			System.out.print("Insira a altura: ");
			altura = entrada.nextDouble();
			entrada.nextLine();

			if (altura != 0) {
				System.out.print("Insira o peso: ");
				peso = entrada.nextDouble();
				entrada.nextLine();

				System.out.print("Insira o sexo: ");
				sexo = Character.toUpperCase(entrada.nextLine().charAt(0));

				switch (sexo) {
				case 'M':
					quantidadeDeHomens++;
					somatorioAlturaHomens += altura;
					break;
				case 'F':
					quantidadeDeMulheres++;
					if (peso < 60) {
						quantiadeDeMulheresComPesoMenorQue60++;
					}
					break;
				}
				quantidadeDePessoas++;
			}

		} while (altura != 0);
		System.out.printf("Quantidade de pessoas pesquisadas: %d \n", quantidadeDePessoas);
		System.out.printf("Quantidade de mulheres: %d \n", quantidadeDeMulheres);
		System.out.printf("Quantidade de homens: %.4f \n", somatorioAlturaHomens / quantidadeDeHomens);
		System.out.printf("Quantidade de mulheres com peso menor que 60: %d \n", quantiadeDeMulheresComPesoMenorQue60);
		entrada.close();
	}
}
