package Conteudo10;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insire a quantidade de pessoas: ");
		double quantidadeDePessoas = entrada.nextDouble();

		// usei o .floor com o + 1 pois quero arrendondar para cima e quando a casa
		// decimal é muito pequena, o java acaba desprezando
		//Math.log10(1.003) = 0.001300933020418072
		int dias = (int) Math.floor(Math.log10(quantidadeDePessoas) / 0.001300933020418072) + 1;
		int anos = dias / 365;
		dias %= 365;

		int meses = dias / 30;
		dias %= 30;

		System.out.printf("Anos = %d Meses = %d Dias = %d", anos, meses, dias);
		entrada.close();
	}
}
