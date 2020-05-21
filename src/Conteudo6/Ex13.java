package Conteudo6;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a hora inicial: ");
		int horaInicial = entrada.nextInt();
		System.out.print("Insira o minuto inical: ");
		int minutoInicial = entrada.nextInt();
		System.out.print("Insira a hora final: ");
		int horaFinal = entrada.nextInt();
		System.out.print("Insira o minuto final: ");
		int minutoFinal = entrada.nextInt();

		int minutoDuracao = (60 - minutoInicial) + minutoFinal;
		int horaDuracao = horaFinal - horaInicial - 1 + (minutoDuracao / 60);
		System.out.println(horaDuracao + " : " + minutoDuracao % 60);
		entrada.close();
	}

}
