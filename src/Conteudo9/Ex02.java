package Conteudo9;

public class Ex02 {
	public static void main(String[] args) {
		double somatorio = 0;

		for (int i = 1; i <= 100; i++) {
			somatorio += (double) i / (i * i + i - 1);
		}

		System.out.println("Valor da série = " + somatorio);
	}
}
