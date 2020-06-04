package Conteudo13;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[10];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Insira o nome: ");
			nomes[i] = entrada.nextLine();
		}
		
		System.out.print("Insira o nome da pessoa procurada: ");
		String alvo = entrada.nextLine();
		
		int posicao = 0;
		for (int i = 0; i < nomes.length; i++) {
			if(alvo.equals(nomes[i])) {
				posicao = i+1;
			}
		}
		
		if(posicao == 0) {
			System.out.println("Pessoa não encontrada");
		}else {
			System.out.println("Posição: "+posicao);
		}
		entrada.close();
	}

}
