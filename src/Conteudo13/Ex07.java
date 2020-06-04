package Conteudo13;
import java.util.Scanner;

public class Ex07 {
	private static class Aluno{
		private String nome;
		private int nota;
		
		public Aluno(String nome, int nota) {
			this.nome = nome;
			this.nota = nota;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public char getConceito() {
			if(nota<=30)
				return 'D';
			else if(nota<=60)
				return 'C';
			else if(nota<=80)
				return 'B';
			else
				return 'A';
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira a nota final: ");
			int nota = entrada.nextInt(); entrada.nextLine();
			
			alunos[i] = new Aluno(nome, nota);
		}

		System.out.println("=========================");
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("|"+alunos[i].getNome());
			if(alunos[i].getNome().length() < 7) {
				System.out.print("\t");
			}
			System.out.println("\t|   "+alunos[i].getConceito()+"\t|");
		}
		System.out.println("=================================");
		
		entrada.close();
	}

}
