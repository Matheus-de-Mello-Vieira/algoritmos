package Conteudo12;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		String[] nome = entrada.nextLine().toUpperCase().split(" ");
		System.out.println("Penúltima palavra: "+nome[nome.length-2]);
		entrada.close();
	}

}
