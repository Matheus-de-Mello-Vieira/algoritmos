package Conteudo8;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 50; i++) {
			System.out.print("Insira a nota final: ");
			double notaFinal = entrada.nextDouble();
			System.out.print("Insira o total de faltas: ");
			int totalFaltas = entrada.nextInt();
			
			if(notaFinal>=65&&totalFaltas<=16) {
				System.out.println("Aluno aprovado");
			}else {
				System.err.println("Aluno reprovado");
			}
		}
		entrada.close();
	}

}
