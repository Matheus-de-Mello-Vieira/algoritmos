package Conteudo13;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		int quantidadeDePares = 0;
		int somatorioPares = 0;
		System.out.print("Número de pares:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2 == 0) {
				somatorioPares+=numeros[i];
				quantidadeDePares++;
				System.out.print(" "+numeros[i]);
			}
		}
		
		System.out.println("\nMédia"+((double)somatorioPares)/quantidadeDePares);
		entrada.close();
	}

}
