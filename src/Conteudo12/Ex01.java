package Conteudo12;

import java.util.Scanner;

public class Ex01 {
	/*
	 * Calcula a dist�cia entre dois pontos pertecentes ao plano xOy
	 * @param x1 double - valor da abscissa do primeiro ponto
	 * @param y2 double - valor da ordenada do primeiro ponto
	 * @param y1 double - valor da abscissa do segundo ponto
	 * @param y2 double - valor da ordenada do segundo ponto
	 * @return double - dist�ncia entre o os dois pontos
	 */
	public static double calcularDistancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o x1: ");
		double x1 = entrada.nextDouble();
		
		System.out.print("Insira o y1: ");
		double y1 = entrada.nextDouble();
		
		System.out.print("Insira o x2: ");
		double x2 = entrada.nextDouble();
		
		System.out.print("Insira o y2: ");
		double y2 = entrada.nextDouble();
		
		System.out.println("Dist�ncia: "+calcularDistancia(x1, y1, x2, y2));
		
		entrada.close();
	}
}
