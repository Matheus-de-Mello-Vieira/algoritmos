package Conteudo9;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a quantidade de termos: ");
		int numeroDeTermos = entrada.nextInt();	
		
		double somatorio = 0;
		
		for (int i = 1; i <= numeroDeTermos; i++) {
			somatorio += ((double)1 + 2*Math.sqrt(i))/(3*i);
		}
		
		System.out.println("Valor da série = "+somatorio);
	}
}
