package Conteudo13;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		int somatorio = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();

			somatorio+=numeros[i];
		}
		
		System.out.print("Divisores:");
		for (int i = 0; i < 10; i++) {
			if(somatorio%numeros[i] == 0)
			System.out.print(" "+numeros[i]);
		}
		entrada.close();
	}
}
