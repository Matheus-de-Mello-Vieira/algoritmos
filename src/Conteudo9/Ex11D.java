package Conteudo9;

public class Ex11D {
	public static void main(String[] args) {
double somatorio = 0;
		
		for (int i = 0; i < 100; i++) {
			somatorio+= Math.pow(i+1, 3)/Math.pow(10, i);
		}
		
		System.out.println("Valor da série = "+somatorio);
	}
}
