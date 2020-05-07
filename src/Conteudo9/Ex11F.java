package Conteudo9;

public class Ex11F {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 1; i <= 100; i++) {
			somatorio+=Math.pow(2, i+1)*(2*i -1)/Math.pow(5*i -3, 2);
		}
		
		System.out.println("Valor da série = "+Math.sqrt(somatorio)*5);
	}
}
