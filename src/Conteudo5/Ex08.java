package Conteudo5;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Infome a área do setor circular: ");
		double S = entrada.nextDouble();

		System.out.println("Informe o angulo:");
		double angulo = entrada.nextDouble();

		System.out.print("Raio: ");
		System.out.println(Math.sqrt(360 * S / angulo / 3.1416));
		entrada.close();
	}

}
