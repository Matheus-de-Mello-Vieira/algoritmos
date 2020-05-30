package Conteudo12;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a frase: ");
		String[] frase = entrada.nextLine().toLowerCase().split(" ");
		for(String palavra:frase) {
			System.out.print(Character.toUpperCase(palavra.charAt(0))+palavra.substring(1) + " ");
		}
		entrada.close();
	}

}
