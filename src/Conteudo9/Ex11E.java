package Conteudo9;

public class Ex11E {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 1; i <= 100; i++) {
			somatorio+= i*i * Math.sqrt(2*i + 3)/Math.pow(i+1, i);
		}
		
		System.out.println("Valor da série = "+somatorio*2/3);
	}
}
