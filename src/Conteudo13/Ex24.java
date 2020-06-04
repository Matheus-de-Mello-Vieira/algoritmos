package Conteudo13;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] alvo = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		int cont = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%3 == 0) {
				alvo[cont] = numeros[i];
				cont++;
			}
		}
		
		System.out.print("Divisores por 3:");
		for (int i = 0; i < cont; i++) {
			System.out.print(" "+alvo[i]);
		}
		entrada.close();
	}

}
