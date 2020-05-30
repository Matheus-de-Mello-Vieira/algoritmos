package Conteudo12;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		String nome[] = entrada.nextLine().split(" ");
		
		System.out.println("Nome da família: "+nome[nome.length-1]);
		entrada.close();
	}

}
