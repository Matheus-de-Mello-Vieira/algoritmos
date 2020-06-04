package Conteudo13;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("Números maiores que 5 e menores que 10:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>5 && numeros[i]<10) {
				System.out.print(" "+numeros[i]);
			}
		}
		
		entrada.close();
	}

}
