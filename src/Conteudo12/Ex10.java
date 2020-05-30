package Conteudo12;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		char nome[] = entrada.nextLine().toUpperCase().toCharArray();
		
		for (char caractere : nome) {
			System.out.println(caractere);
		}
		entrada.close();
	}

}
