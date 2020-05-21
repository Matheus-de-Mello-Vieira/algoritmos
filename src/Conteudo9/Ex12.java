package Conteudo9;

public class Ex12 {
	public static void main(String[] args) {
		double somatorio = 0;
		double sinal = 1;
		for (int i = 0; i < 10000; i++) {
			somatorio += sinal / (2 * i + 1);
			sinal *= -1;
		}
		somatorio *= 4;
		System.out.println("Valor da série =" + somatorio);
	}
}
