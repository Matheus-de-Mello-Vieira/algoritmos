package Conteudo13;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o n�mero do bilhete: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("Insira o n�mero: ");
		int alvo = entrada.nextInt();
		
		boolean vencedor = false;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == alvo) {
				vencedor = true;
				break;
			}
		}
		
		if(vencedor) {
			System.out.println("Venceu");
		}else {
			System.out.println("N�o venceu");
		}
		entrada.close();
	}

}
