package Conteudo13;
import java.util.Scanner;

public class Ex11 {
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
		
		public int getNota() {
			return this.nota;
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
		
		int maiorNotaIndex = 0;
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i].getNota() > alunos[maiorNotaIndex].getNota()) {
				maiorNotaIndex = i;
			}
		}
		
		System.out.println("Maior nota: "+alunos[maiorNotaIndex].getNome());
		entrada.close();
	}

}
