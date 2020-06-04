package Conteudo13;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("Quadrados:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+(int)Math.pow(numeros[i], 2));
		}
		
		entrada.close();
	}

}
