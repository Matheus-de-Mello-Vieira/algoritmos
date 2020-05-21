package Conteudo9;

public class Ex08 {
	public static void main(String[] args) {
		double somatorio = 0;

		for (int i = 1; i <= 20; i++) {
			somatorio += (1 + 2 * i) * Math.sqrt(4 * i + 1) / Math.pow(5, i);
		}

		System.out.println("Valor da série = " + (somatorio * somatorio));
	}
}
