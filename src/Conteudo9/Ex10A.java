package Conteudo9;

public class Ex10A {
	public static void main(String[] args) {
		double somatorio = 0;

		for (int i = 1; i <= 100; i++) {
			somatorio += Math.sqrt(i / 2.0);
		}

		System.out.println("Valor da série = " + somatorio);
	}
}
