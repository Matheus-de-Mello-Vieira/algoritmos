package Conteudo13;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length-1; i++) {
			System.out.print("Insira o n�mero: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("Insira o n�mero: ");
		int alvo = entrada.nextInt();
		
		int somatorio = 0;
		int quantidade = 0;
		System.out.print("N�mero maiores:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > alvo) {
				System.out.println(" "+numeros[i]);
				somatorio+=numeros[i];
				quantidade++;
				break;
			}
		}
		
		System.out.println("M�dia: "+((double)somatorio)/quantidade);
		entrada.close();
	}

}
