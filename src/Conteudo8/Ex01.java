package Conteudo8;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o raio: ");
			double raio = entrada.nextDouble();
			System.out.printf("Área = %.2f\n", 3.1416 * raio * raio);
		}
		entrada.close();
	}

}
