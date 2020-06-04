package Conteudo13;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[12];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Insira o nome: ");
			nomes[i] = entrada.nextLine();
		}
		
		Arrays.sort(nomes);
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
		entrada.close();
	}

}
