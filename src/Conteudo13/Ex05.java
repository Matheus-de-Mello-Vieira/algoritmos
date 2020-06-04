package Conteudo13;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		int indexMaior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeros[indexMaior]) {
				indexMaior = i;
			}
		}
		
		System.out.println("Maior número: "+numeros[indexMaior]);
		entrada.close();
	}

}
