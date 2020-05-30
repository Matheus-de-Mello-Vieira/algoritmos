package Conteudo12;

import java.util.Scanner;

public class Ex02 {
	/*
	 * Executa a função f
	 * @param x double - domínio
	 * @return double - imagem do domínio dado 
	*/
	public static double f (double x) {
		
		if(x == 4) {
			return 0;
		}
		
		double num = 5 * x + 3;
		double den = Math.sqrt(Math.abs(Math.pow(x,2) - 16));

		return num/den;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x = 0;
		do {
			System.out.print("Insira o x: ");
			x = entrada.nextDouble();
			
			System.out.printf("f(%.2f) = %f\n",x,f(x));
		}while(x!=-1);
		
		entrada.close();
	}
}
