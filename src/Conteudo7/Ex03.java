package Conteudo7;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o imposto: R$");
		double imposto = entrada.nextInt();

		System.out.print("Insira os dias de atraso: ");
		int diasAtraso = entrada.nextInt();

		double multa = 0;
		if (diasAtraso < 10) {
		} else if (diasAtraso <= 30) {
			multa = imposto * 0.02;
		} else if (diasAtraso <= 60) {
			multa = imposto * (0.10 + 0.005 * diasAtraso);
		} else if (diasAtraso <= 100) {
			multa = imposto * 2;
		} else {
			multa = imposto * (1.5 + 0.01 * diasAtraso);
		}

		System.out.println("Multa: R$" + multa);
		entrada.close();
	}

}
