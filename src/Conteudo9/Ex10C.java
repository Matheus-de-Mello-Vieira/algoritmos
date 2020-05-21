package Conteudo9;

public class Ex10C {
	public static void main(String[] args) {
		double somatorio = 0;

		for (int i = 0; i < 100; i++) {
			double numero = 2 * i + 1;
			somatorio += numero / (numero + 1.0);
		}

		System.out.println("Valor da série = " + (somatorio * somatorio) / 3);
	}
}
