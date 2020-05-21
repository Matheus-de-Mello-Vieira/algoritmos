package Conteudo6;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira a altura: ");
		double altura = entrada.nextDouble();
		entrada.nextLine();

		System.out.print("Insira o sexo: ");
		char sexo = entrada.nextLine().charAt(0);

		switch (sexo) {
		case 'M':
			System.out.printf("Peso Ideal = %.3f", 72.7 * altura - 58);
			break;
		case 'F':
			System.out.printf("Peso Ideal = %.3f", 62.1 * altura - 44.7);
			break;
		default:
			System.err.println("Sexo invalido: " + sexo);
			break;
		}
		entrada.close();
	}

}
