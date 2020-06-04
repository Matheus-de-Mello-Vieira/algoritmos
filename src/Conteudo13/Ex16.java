package Conteudo13;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		System.out.println();
		System.out.print("Insira o número real: ");
		double numeroReal = entrada.nextDouble();
		
		System.out.print("Produtos:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]*numeroReal);
		}
		
		entrada.close();
	}

}
