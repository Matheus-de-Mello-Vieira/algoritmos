package Conteudo11;

public class Ex14 {
	public static void main(String[] args) {
		double valorAtual = 0;
		
		int num = 4;
		double den = 1;
		int i = 0;
		while(valorAtual<=3.1416 || valorAtual>=3.1417) {
			valorAtual+=num/den;
			num*=-1;
			den+=2;
			i++;
		}
		
		System.out.println("Valor de pi: "+valorAtual);
		System.out.println("Termos: "+i);
	}
}
