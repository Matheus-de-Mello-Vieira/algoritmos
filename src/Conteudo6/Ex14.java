package Conteudo6;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número de 4 digitos: ");
		int numero = entrada.nextInt();
		if((numero/1000)==0 || (numero/1000)>9) {
			System.err.println("Número tem que ter 4 dígitos");
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.print(((int)(numero%Math.pow(10, i+1)))/(int)Math.pow(10, i));
		}
		entrada.close();
	}

}
