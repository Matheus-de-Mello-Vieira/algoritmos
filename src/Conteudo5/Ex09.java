package Conteudo5;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int[] pesos = {2,3,5};
		
		double somatorio = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print("Informe a "+(i+1)+"º nota: ");
			somatorio+= entrada.nextDouble() * pesos[i];
		}
		System.out.println("Média ponderada: "+(somatorio/10));
		
		entrada.close();
	}

}
