package Conteudo5;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira o número: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		System.out.println("Banco = "+numero/Math.round(Math.pow(10, 6)));
		numero %= Math.round(Math.pow(10, 6));
		
		System.out.println("Banco = "+numero/Math.round(Math.pow(10, 3)));
		numero %= Math.round(Math.pow(10, 3));
		
		System.out.println("Banco = "+numero);
		entrada.close();
	}

}
