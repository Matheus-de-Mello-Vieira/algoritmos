package Conteudo11;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int somatorioIdades = 0;
		int somatorioPontos = 0;
		int quantidadeDeHomens = 0;
		int quantidadeDeMulheresQuePerderam7Pontos = 0;
		
		int idadeMaior = 0;
		String pessoaMaisVelha = "";
		for (int i = 0; i < 230; i++) {
			System.out.println("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Insira a idade: ");
			int idade = entrada.nextInt(); entrada.nextLine();
			
			System.out.println("Insira o sexo: ");
			char sexo = Character.toUpperCase(entrada.nextLine().charAt(0));
			
			System.out.println("Quantidade de pontos perdidos: ");
			int pontos = entrada.nextInt();
			
			somatorioIdades+=idade;
			somatorioPontos+=pontos;
			
			if(sexo=='M') {
				quantidadeDeHomens++;
			}else if(pontos>=7) {
				quantidadeDeMulheresQuePerderam7Pontos++;
			}
			
			if(idadeMaior<idade) {
				idadeMaior = idade;
				pessoaMaisVelha = nome;
			}
		}
		
		System.out.println("Idade média dos condutores: "+somatorioIdades/230.0);
		System.out.println("Valor total das multas aplicadas: "+somatorioPontos);
		System.out.println("Percentual de homens multados: "+quantidadeDeHomens/2.30);
		System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: "+quantidadeDeMulheresQuePerderam7Pontos);
		System.out.println("Nome da pessoa mais velha: "+pessoaMaisVelha);
		System.out.println("Idade da pessoa mais velha: "+idadeMaior);
		entrada.close();
	}
}
