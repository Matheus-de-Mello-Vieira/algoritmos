package Conteudo11;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número: ");
		int numero = entrada.nextInt();
		
		for(int i = 0;i<numero;i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("EMGE ");
			}
			System.out.println();
		}
		entrada.close();
	}

}
