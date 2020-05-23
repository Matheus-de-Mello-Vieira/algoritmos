package Conteudo11;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somatorioCanal4 = 0;
		int somatorioCanal7 = 0;
		int somatorioCanal12 = 0;
		
		for (int i = 0; i < 78; i++) {
			System.out.println("Insira o canal: ");
			byte canal = entrada.nextByte();
			
			System.out.println("Insira o número de pessoas");
			byte numeroDePessoas = entrada.nextByte();
			
			switch (canal) {
			case 4:
				somatorioCanal4+=numeroDePessoas;
				break;

			case 7:
				somatorioCanal7+=numeroDePessoas;
				break;
				
			case 12:
				somatorioCanal12+=numeroDePessoas;
				break;
			}
		}
		
		double somatorio = somatorioCanal4 + somatorioCanal7 + somatorioCanal12;
		
		System.out.println("Audiência do canal 4: "+somatorioCanal4);
		System.out.println("Audiência do canal 7: "+somatorioCanal7);
		System.out.println("Audiência do canal 12: "+somatorioCanal12);
		
		System.out.println("Porcentagem de audiência do canal 4: "+somatorioCanal4*100/somatorio);
		System.out.println("Porcentagem de audiência do canal 7: "+somatorioCanal7*100/somatorio);
		System.out.println("Porcentagem de audiência do canal 12: "+somatorioCanal12*100/somatorio);
		
		System.out.print("Canal mais assistido: ");
		if(somatorioCanal4>somatorioCanal7)
			if(somatorioCanal4>somatorioCanal12)
				System.out.println("4");
			else if(somatorioCanal4 == somatorioCanal12)
				System.out.println("4 e 12");
			else
				System.out.println("12");
		else if(somatorioCanal4 == somatorioCanal7)
			if(somatorioCanal4>somatorioCanal12)
				System.out.println("4 e 7");
			else if(somatorioCanal4==somatorioCanal12)
				System.out.println("4, 7 e 12");
			else
				System.out.println("12");
		else
			if(somatorioCanal7>somatorioCanal12)
				System.out.println("7");
			else if(somatorioCanal7 == somatorioCanal12)
				System.out.println("7 e 12");
			else
				System.out.println("12");
		
		System.out.println("Media de pessoas: "+somatorio/78);
		entrada.close();
	}
}
