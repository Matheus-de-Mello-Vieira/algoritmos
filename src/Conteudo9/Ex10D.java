package Conteudo9;

public class Ex10D {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 1; i <= 100; i++) {
			somatorio+= (2*i-1)/Math.pow(i, 2);
		}
		
		System.out.println("Valor da série = "+somatorio);
	}
}
