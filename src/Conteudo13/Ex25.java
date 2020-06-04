package Conteudo13;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex25 {
	private static class Time{
		private int pontuacaoFinal;
		private String nome;
		
		public Time(String nome,int pontuacaoFinal) {
			this.nome = nome;
			this.pontuacaoFinal = pontuacaoFinal;
		}
		
		public int getPontuacaoFinal() {
			return pontuacaoFinal;
		}
		
		public String getNome() {
			return nome;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Time[] times = new Time[20];
		
		for (int i = 0; i < times.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira a pontuação final: ");
			int pontuacaoFinal = entrada.nextInt();
			
			times[i] = new Time(nome, pontuacaoFinal);
			
		}
		
		Arrays.sort(times,(Time a, Time b) -> {return -1*Integer.compare(a.getPontuacaoFinal(), b.getPontuacaoFinal());});
		
		System.out.print("Insira o time alvo: ");
		String alvo = entrada.nextLine();
		
		for (int i = 0; i < times.length; i++) {
			if(alvo.equals(times[i].getNome())) {
				System.out.print("situação: ");
				int pontuacaofinal = times[i].getPontuacaoFinal();
				
				if(pontuacaofinal<=4) {
					System.out.println("Copa libertadores");
				}else if(pontuacaofinal<=12) {
					System.out.println("Copa Sul-americana");
				}else if(pontuacaofinal>=17 && pontuacaofinal <= 20) {
					System.out.println("Rebaixada");
				}
				break;
			}
		}
		
		entrada.close();
	}

}
