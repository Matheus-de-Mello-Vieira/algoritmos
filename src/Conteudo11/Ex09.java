package Conteudo11;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo!");
		System.out.println("Escreva FIM no nome para terminar o programa");
		String nome = "";
		
		int[] quantidadePorSetor = {0,0,0,0};
		int quantidadeDeFuncionarios2010Administracao = 0;
		
		int anoMenor = 0;
		int ordemMenor =0;
		String funcionarioMenor = "";
		
		int anoMaior = 0;
		int ordemMaior = 0;
		String funcionarioMaior = "";
		do {
			System.out.print("Insira o nome: ");
			nome = entrada.nextLine();	
			
			if(!nome.equals("FIM")) {
				System.out.print("Insira o registro funcional: ");
				int rf = entrada.nextInt();entrada.nextLine();
				
				int ano = rf/10000;
				int setor = (rf/1000)%10;
				int ordem = rf%1000;
				
				if(ano<10 || ano > 14 || setor < 1 || setor > 4 || rf < 99999 || rf > 999999) {
					System.out.println("registro inválido");
				}else {
					quantidadePorSetor[setor-1]++;
					
					if(setor==2 && ano == 10) {
						quantidadeDeFuncionarios2010Administracao++;
					}
					
					if(anoMenor>ano || anoMenor == 0) {
						anoMenor = ano;
						ordemMenor = 0;
						funcionarioMenor = nome;
					}else if (anoMenor == ano && (ordemMenor>ordem || ordem == 0)) {
						ordemMenor = ordem;
						funcionarioMenor = nome;
					}
					
					if(anoMaior<ano) {
						anoMaior = ano;
						ordemMaior = 0;
						funcionarioMaior = nome;
					}else if(anoMaior == ano && ordemMaior>ordem) {
						ordemMaior = ano;
						funcionarioMaior = nome;
					}
				}
			}
		}while(!nome.equals("FIM"));
		System.out.println("Quantidade por setor: ");
		System.out.println("Gerência: "+quantidadePorSetor[0]);
		System.out.println("Administração: "+quantidadePorSetor[1]);
		System.out.println("Pesquisa: "+quantidadePorSetor[2]);
		System.out.println("Obras: "+quantidadePorSetor[3]);
		
		System.out.println("Quantidade de funcionários admitidos em 2010 e trabalham na administração: "+quantidadeDeFuncionarios2010Administracao);
		
		int maiorNumero = 0;
		int maiorSetor = 0;
		for (int i = 0; i < quantidadePorSetor.length; i++) {
			if(maiorNumero<quantidadePorSetor[i]) {
				maiorNumero=quantidadePorSetor[i];
				maiorSetor = i+1;
			}
		}
		
		System.out.print("Setor com mais funcionários alocados: ");
		switch (maiorSetor) {
		case 1:
			System.out.println("Gerência");
			break;
		case 2:
			System.out.println("Administração");
			break;
		case 3:
			System.out.println("Pesquisa");
			break;
		case 4:
			System.out.println("Obra");
			break;
		}
		
		System.out.println("Primeiro funcionário: "+funcionarioMenor);
		System.out.println("Último funcionário: " + funcionarioMaior);
		
		entrada.close();
	}
}
