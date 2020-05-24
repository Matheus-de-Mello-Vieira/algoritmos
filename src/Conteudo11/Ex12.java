package Conteudo11;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número: ");
		int numero = entrada.nextInt();
		int numeroDireita = 0;
		int numeroBase = 0;
		for(int i = 1;i<=numero;i++) {
			numeroDireita+=i;
			numeroBase+=1;
			
			System.out.print(numeroDireita);
			System.out.println(numeroBase*(i+1) - numeroDireita);
			
			numeroDireita*=10;
			numeroBase*=10;
		}
		entrada.close();
	}

}
