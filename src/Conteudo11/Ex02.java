package Conteudo11;

import java.util.Scanner;

public class Ex02 {
	private enum Classificacoes {
	       Bronze, Prata, Ouro
	} 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//variaveis da b
		int quantidadeOuro = 0;
		int quantidadePrata = 0;
		int quantidadeBronze = 0;
		
		double somatorioBronze = 0;
		double somatorioTotal = 0;
		double menorValor = 0;
		String menorNome="";
		for (int i = 0; i < 538; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira o valor aplicado: ");
			double valor = entrada.nextDouble(); entrada.nextLine();
			
			Classificacoes classificao;
			if(valor < 1000) {
				classificao = Classificacoes.Bronze;
				quantidadeBronze++;
				
				//resolu��o c
				somatorioBronze+=valor;
				
			}else if(valor<5000) {
				classificao = Classificacoes.Prata;
				quantidadePrata++;
				
			}else {
				classificao = Classificacoes.Ouro;
				quantidadeOuro++;
				
			}
			
			//resolu��o a
			System.out.println("Nome: "+nome);
			System.out.println("Classifica��o: "+classificao.name());
			
			//resolu��o d
			somatorioTotal+=valor;
			
			//resolu��o e
			if(menorValor>valor || menorValor == 0) {
				menorValor = valor;
				menorNome = nome;
			}
		}
		
		//resolu��o b
		System.out.println("Quantidade de clientes por classifica��es: ");
		System.out.println("Bronze: "+quantidadeBronze);
		System.out.println("Prata: "+quantidadePrata);
		System.out.println("Ouro: "+quantidadeOuro);
		
		//resolu��o c
		System.out.println("M�dia dos valores aplicados dos cliente bronze: "+somatorioBronze/quantidadeBronze);
		
		//resolu�ao d
		System.out.println("Volume total de aplica��es: "+somatorioTotal);
		
		//resolu��o e
		System.out.println("Menor aplica��o: "+menorNome);
		entrada.close();
	}
}
