package Conteudo6;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");
		int A = entrada.nextInt();
		System.out.print("Insira o valor de B: ");
		int B = entrada.nextInt();
		System.out.print("Insira o valor de C: ");
		int C = entrada.nextInt();
		
		double delta = Math.pow(B, 2) - 4 * A * C;
		
		if(delta<0) {
			System.out.println("Não há raízes reais");
		}else if(delta==0) {
			System.out.println("Há 1 raizes real");
			System.out.println("X = " + (B*-1 + Math.sqrt(delta))/(2*A));
		}else {
			System.out.println("Há 2 raizes reais");
			System.out.println("X = " + (B*-1 + Math.sqrt(delta))/(2*A));
			System.out.println("X = " + (B*-1 - Math.sqrt(delta))/(2*A));
		}
		entrada.close();
	}

}
