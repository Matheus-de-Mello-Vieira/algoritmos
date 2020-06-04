package Conteudo13;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("Divisores de 34:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]==1 || numeros[i] == 2 || numeros[i] == 17 || numeros[i] == 34) {
				System.out.print(" "+numeros[i]);
			}
		}
		
		entrada.close();
	}

}
