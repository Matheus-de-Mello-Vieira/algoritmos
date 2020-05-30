package Conteudo12;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public int numero = 0;
	
	public int tentar(int tentativa) {
		return (int)Math.signum(tentativa - numero);
	}
	
	public Ex04() {
		Random random = new Random(System.currentTimeMillis());
		numero = random.nextInt(99)+1;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ex04 ex04 = new Ex04();
		int atual = 0;
		int numeroDeTentativas = 0;
		do {
			System.out.print("Insira o número: ");
			int tentativa = entrada.nextInt();
			atual = ex04.tentar(tentativa);
			numeroDeTentativas++;
			
			switch (atual) {
			case 1:
				System.out.println("Valor acima");
				break;
			case -1:
				System.out.println("Valor abaixo");
				break;
			case 0:
				System.out.println("Acertou");
				System.out.println("Número de tentativas: "+numeroDeTentativas);
			}
		}while(atual!=0);
		entrada.close();
	}
}
