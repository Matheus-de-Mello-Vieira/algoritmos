package Conteudo9;

public class Ex11C {
	public static void main(String[] args) {
		double somatorio = 0;

		for (int i = 1; i <= 100; i++) {
			somatorio += ((2 * i + 1) * Math.sqrt(4 * i + 1)) / Math.pow(5, i);
		}

		System.out.println("Valor da série = " + somatorio * somatorio);
	}
}
