package Conteudo11;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		int quantidade = 0;
		int somatorio = 0;
		int quantidadeIngles = 0;
		
		do {
			System.out.print("Insira o nome do aluno: ");
			nome = entrada.nextLine();
			
			if(!nome.equals("FIM")) {
				System.out.print("Insira o código da opção: ");
				byte codigo = entrada.nextByte(); entrada.nextLine();
			
				int mensalidade = 0;
				switch (codigo) {
				case 1:
					mensalidade = 100;
					quantidadeIngles++;
					break;

				case 2:
					mensalidade = 150;
					break;
				
				case 3:
					mensalidade = 120;
					break;
				}
			
				System.out.println("Nome: "+nome);
				System.out.println("Valor da mensalidade: "+mensalidade);
			
				quantidade++;
				somatorio+=mensalidade;
			}
		}while(!nome.equals("FIM"));
		System.out.println("Quantidade de alunos matriculados nas turmas de inglês: "+ quantidadeIngles);
		System.out.println("Mensalidade média da escola: "+(double)somatorio/quantidade);
		entrada.close();
	}
}
