package Conteudo6;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o n�mero: ");
		int numero = entrada.nextInt();
		if (numero % 35 == 0) {
			System.out.println(numero + " � divis�vel simultaneamente por 5 e 7");
		} else {
			System.out.println(numero + " n�o � divis�vel simultaneamente por 5 e 7");
		}
		entrada.close();
	}

}
