package Conteudo12;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual é o nome da familia? ");
		String familia = entrada.nextLine();
		
		int numeroDePessoasDaFamilia = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			if(nome.endsWith(familia)) {
				numeroDePessoasDaFamilia++;
			}
		}
		System.out.print("Número de pessoas: "+numeroDePessoasDaFamilia);
		entrada.close();
	}
}
