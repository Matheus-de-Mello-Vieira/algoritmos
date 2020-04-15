package Conteudo8;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor: ");
		int valor = entrada.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n",i,valor,valor*i);
		}
		entrada.close();
	}
}
