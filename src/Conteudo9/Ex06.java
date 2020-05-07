package Conteudo9;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		double somatorio = 10;
		
		for (int i = 1; i <= 20; i++) {
			somatorio+= Math.sqrt(i/2.0);
		}
		
		System.out.println("Valor da série = "+somatorio);
	}
}
