package Conteudo9;

public class Ex01 {
	public static void main(String[] args) {
		double somatorio = 0;
		
		for (int i = 37; i > 0; i--) {
			somatorio += ((double)i*(i+1))/(38-i);
		}
		
		System.out.println("Valor da série = "+somatorio);
	}
}
