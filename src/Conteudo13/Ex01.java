package Conteudo13;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		int quantidadeDeDivisores = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%35 == 0) {
				quantidadeDeDivisores++;
			}
		}
		
		System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: "+quantidadeDeDivisores);
		entrada.close();
	}

}
