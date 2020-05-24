package Conteudo11;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número: ");
		int numero = entrada.nextInt();
		
		double num = 0;
		double den = 0;
		double serie = 0;
		
		int i = 0;
		while(i<numero) {
			i++;
			num = i * Math.pow(1 + 9 * i,2*i);
			den = Math.pow(7, i-1);

			serie+=num/den;
		}
		
		serie = Math.cbrt(serie);
		serie += 71;
		
		System.out.println("Valor da série = "+serie);
		entrada.close();
	}

}
