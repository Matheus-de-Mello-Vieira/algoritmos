package Conteudo13;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
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
		Aluno[] alunos = new Aluno[8];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira a nota final: ");
			int nota = entrada.nextInt(); entrada.nextLine();
			
			alunos[i] = new Aluno(nome, nota);
		}
		
		ArrayList<Integer> maiorNotaIndex = new ArrayList<>();

		for (int i = 0; i < alunos.length; i++) {
			if(maiorNotaIndex.isEmpty()) {
				maiorNotaIndex.add(i);
			}else if(alunos[i].getNota() > alunos[maiorNotaIndex.get(0)].getNota()) {
				maiorNotaIndex.clear();
				maiorNotaIndex.add(i);
			}else if(alunos[i].getNota() == alunos[maiorNotaIndex.get(0)].getNota()) {
				maiorNotaIndex.add(i);
			}
		}
		
		System.out.print("Alunos com maior nota:");
		boolean controladorVirgula = false;
		for(int index:maiorNotaIndex) {
			if(controladorVirgula) {
				System.out.print(",");
			}
			controladorVirgula = true;
			System.out.print(" "+alunos[index].getNome());
		}
		
		entrada.close();
	}

}
