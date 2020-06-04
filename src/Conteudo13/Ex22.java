package Conteudo13;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i+=2) {
			System.out.print(numeros[i] + " ");
		}
		
		for (int i = 1; i < numeros.length; i+=2) {
			System.out.print(numeros[i] + " ");
		}
		entrada.close();
	}

}
