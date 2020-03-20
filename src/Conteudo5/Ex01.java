package Conteudo5;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//x^3 + 4x + 10
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número: ");
		double x = teclado.nextDouble(); 
		
		System.out.print("Resultado: ");
		System.out.println(Math.pow(x, 3)+4*x+10);
		teclado.close();
	}
}
