package Conteudo13;
import java.util.Scanner;

public class Ex10 {
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
		Aluno[] alunos = new Aluno[50];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira a nota: ");
			int nota = entrada.nextInt(); entrada.nextLine();
			
			alunos[i] = new Aluno(nome, nota);
		}

		double media = 0;
		for (int i = 0; i < alunos.length; i++) {
			media+=alunos[i].getNota();
		}
		media/=(double)alunos.length;
		
		System.out.print("Alunos acima da média: ");
		boolean controladorVirgula = false;
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i].getNota()>media) {
				if(controladorVirgula) {
					System.out.print(",");
				}
				controladorVirgula = true;
				System.out.print(" "+alunos[i].getNome());
			}
		}
		entrada.close();
	}

}
