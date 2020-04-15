package Conteudo8;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int somatorioAprovados = 0;
		int alunosFaltosos = 0;
		int alunosAprovados = 0;
		
		for (int i = 0; i < 50; i++) {
			System.out.print("Insira a nota final: ");
			int notaFinal = entrada.nextInt();
			
			System.out.print("Insira a quantidade de faltas: ");
			int quantidadeFaltas = entrada.nextInt();
			
			if(quantidadeFaltas>16) {
				alunosFaltosos++;
				System.out.println("Aluno reprovado");
			}else if(notaFinal>=65) {
				somatorioAprovados+=notaFinal;
				alunosAprovados++;
				System.out.println("Aluno aprovado");
			}else {
				System.out.println("Aluno reprovado");
			}
		}
		
		System.out.println("Média das notas dos aprovados = "+(somatorioAprovados/(double)alunosAprovados));
		System.out.println("Quantidade de alunos com mais de 16 faltas = "+alunosFaltosos);
		entrada.close();
	}

}
