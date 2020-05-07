package Conteudo9;

public class Ex11A {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 0; i < 100; i++) {
			somatorio+= (8*i+2)/Math.pow(4, i);
		}
		
		System.out.println("Valor da série = "+Math.pow(somatorio,1/3.0));
	}
}
