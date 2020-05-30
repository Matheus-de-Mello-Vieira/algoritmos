package Conteudo12;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome do autor: ");
		String nome[] = entrada.nextLine().toUpperCase().split(" ");
		String resultado = nome[nome.length-1] + ", ";
		for (int i = 0; i < nome.length-1; i++) {
			resultado = resultado + nome[i].charAt(0)+". ";
		}
		
		System.out.print("Resultado: "+resultado);
		entrada.close();
	}

}
