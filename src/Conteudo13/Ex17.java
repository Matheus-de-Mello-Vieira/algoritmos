package Conteudo13;
import java.util.Iterator;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o n�mero: ");
			numeros[i] = entrada.nextInt();
		}
		
		int[] numerosInvertidos = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			numerosInvertidos[numeros.length-i-1] = numeros[i];
		}
		
		System.out.print("Vetor ao contr�rio:");
		for (int i : numerosInvertidos) {
			System.out.print(" "+i);
		}
		entrada.close();
	}

}
