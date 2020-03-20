package Conteudo5;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número de 5 digitos: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		System.out.println("Impressão: ");
		
		for(int i=4;i>=0;i--) {
			int casas = Math.round((float)Math.pow(10, i));
			System.out.println(numero/casas);
			numero%=casas;
		}
	}
}
