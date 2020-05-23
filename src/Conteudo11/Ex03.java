package Conteudo11;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia = 0;
		int quantidadeDeMultas8NaPrimeiraQuizena = 0;
		int valorTotal = 0;
		do{
			System.out.print("Insira o dia: ");
			dia = entrada.nextInt();entrada.nextLine();
			
			if(dia!=99) {
			System.out.print("Insira a placa: ");
			String placa = entrada.nextLine();
			
			System.out.print("Insira a quantidade de pontos");
			int pontos = entrada.nextInt();entrada.nextLine();
			int multa = 0;
			switch (pontos) {
			case 3:
				multa = 42;
				break;
			case 5:
				multa=108;
				break;
			case 8:
				multa=479;
				
				//resolução b
				if(dia <= 15) {
					quantidadeDeMultas8NaPrimeiraQuizena++;
				}
				break;
			}
			
			//resolução a
			System.out.println("Multa aplicada: "+multa);
			System.out.println("Placa: " + placa);
			System.out.println("Pontos: " + pontos);
			
			//resolução c
			valorTotal++;
			}
		}while(dia!=99);
		
		System.out.println("Quantiade multas de pontuação 8 da primeira quinzena do mês: "+quantidadeDeMultas8NaPrimeiraQuizena);
		
		System.out.println("Valor total arrecadado: "+valorTotal);
	}
}
