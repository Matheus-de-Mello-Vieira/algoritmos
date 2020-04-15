package Conteudo8;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nomeDoMaisVelho="";
		int idadeMaior = 0;
		int somatorioIdades = 0;
		int alunosAcima30 = 0;
		int alunosAte12 = 0;
		for (int i = 0; i < 50; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			System.out.print("Insira a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();
			
			if(idade>idadeMaior) {
				nomeDoMaisVelho = nome;
				idadeMaior = idade;
			}
			
			if(idade<=12) {
				alunosAte12++;
			}else if(idade > 30) {
				alunosAcima30++;
			}
			
			somatorioIdades+=idade;
		}
		
		System.out.println("Alunos até 12 anos = "+alunosAte12);
		System.out.println("Alunos acima de 30 anos = "+alunosAcima30);
		System.out.println("Média das idades = " + (somatorioIdades/50.0));
		System.out.println("Aluno de maior idade = "+nomeDoMaisVelho);
		entrada.close();
	}

}
