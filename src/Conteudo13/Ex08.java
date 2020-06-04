package Conteudo13;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Soma %d = %d\n",i+1,numeros[i] + numeros[10+i]);
		}
		entrada.close();
	}
}
