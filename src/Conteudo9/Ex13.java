package Conteudo9;

public class Ex13 {
	public static void main(String[] args) {
		double somatorio = 0;
		int sinal = 1;
		int numerador = 1, denominador = 1, delta = 1;
		for (int i = 1; i <= 10; i++) {
			numerador *= i;
			somatorio += (double) numerador / denominador * sinal;
			sinal *= -1;
			delta *= 2;
			denominador += delta;
		}
		System.out.println("Valor da série =" + somatorio);
	}
}
