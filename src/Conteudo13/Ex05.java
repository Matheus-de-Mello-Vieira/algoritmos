package Conteudo13;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o n�mero: ");
			numeros[i] = entrada.nextInt();
		}
		
		int indexMaior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeros[indexMaior]) {
				indexMaior = i;
			}
		}
		
		System.out.println("Maior n�mero: "+numeros[indexMaior]);
		entrada.close();
	}

}
