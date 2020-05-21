package Conteudo5;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor de x: ");
		double x = entrada.nextDouble();

		System.out.print("F(x) = ");
		System.out.println(Math.sqrt(Math.pow(x / 4 + 1, 2) + x / 5));
		entrada.close();
	}

}
