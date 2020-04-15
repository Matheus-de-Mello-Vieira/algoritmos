package Conteudo7;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int nota = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Insira a nota: ");
			nota+=entrada.nextInt();
		}
		
		System.out.print("Conceito ");
		if(nota >= 90) {
			System.out.print("A");
		}else if(nota>=89) {
			System.out.println("B");
		}else if(nota>=70) {
			System.out.println("C");
		}else if(nota>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		entrada.close();
	}

}
