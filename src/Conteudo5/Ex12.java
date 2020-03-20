package Conteudo5;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira a duração em segundos: ");
		Scanner entrada = new Scanner(System.in);
		int duracaoSegundos = entrada.nextInt();
		
		int hora = duracaoSegundos/3600;
		duracaoSegundos%=3600;
		
		int minutos = duracaoSegundos/60;
		duracaoSegundos%=60;
		
		System.out.printf("Hora: %d Minutos %d Segundos: %d", hora,minutos,duracaoSegundos);
		
		entrada.close();
	}
}