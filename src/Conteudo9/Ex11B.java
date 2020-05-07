package Conteudo9;

public class Ex11B {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 0; i < 100; i++) {
			somatorio+= (1 + 3*i)/Math.sqrt(7 + 3*i);
		}
		
		System.out.println("Valor da série = "+somatorio*5/3);
	}
}
