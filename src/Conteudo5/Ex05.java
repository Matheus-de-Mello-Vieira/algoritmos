package Conteudo5;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		Double celsius = entrada.nextDouble();

		System.out.printf("Valor em Kelvin: %.2f \nValor em Fahrenheit: %.2f", celsius + 273, 9 * celsius / 5 + 32);
		entrada.close();
	}

}
