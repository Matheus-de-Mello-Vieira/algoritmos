package Conteudo8;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de pessoas: ");
		int numero = entrada.nextInt();
		entrada.nextLine();

		int numeroHomens = 0;
		int somatorioIdadesMulher = 0;
		int somatorioIdadesHomem = 0;
		for (int i = 0; i < numero; i++) {
			System.out.print("Insira o nome: ");
			entrada.nextLine();

			System.out.print("Insira a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira ao sexo: ");
			char sexo = entrada.nextLine().charAt(0);

			switch (sexo) {
			case 'M':
				somatorioIdadesHomem += idade;
				numeroHomens++;
				break;
			case 'F':
				somatorioIdadesMulher += idade;
				break;
			}

		}

		System.out.println("Média das idades dos homens: " + ((double) somatorioIdadesHomem / numeroHomens));
		System.out.println(
				"Média das idades das mulheres: " + ((double) somatorioIdadesMulher / (numero - numeroHomens)));
		entrada.close();
	}

}
