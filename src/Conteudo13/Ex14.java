package Conteudo13;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex14 {
	private static class Cidade{
		private String nome;
		private String estado;
		private int populacao;
		
		public Cidade(String nome, String estado, int populacao) {
			this.nome = nome;
			this.estado = estado;
			this.populacao = populacao;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getEstado() {
			return estado;
		}
		
		public int getPopulacao() {
			return populacao;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Cidade[] cidades = new Cidade[100];
		
		for (int i = 0; i < cidades.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira o estado: ");
			String estado = entrada.nextLine();
			
			System.out.print("Insira a população: ");
			int populacao = entrada.nextInt(); entrada.nextLine();
			
			cidades[i] = new Cidade(nome,estado, populacao);
		}
		
		Arrays.sort(cidades,(Cidade a, Cidade b) -> {return Integer.compare(a.getPopulacao(), b.getPopulacao());});
		
		for(int i = 9; i >= 0;i--) {
			System.out.println("i: ");
			System.out.println("\t nome: "+cidades[i].getNome());
			System.out.println("\t estado: "+cidades[i].getEstado());
		}
		entrada.close();
	}

}
