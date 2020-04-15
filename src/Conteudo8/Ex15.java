package Conteudo8;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somatorio=0;
		int contador = 0;
		for (int i = 1001; i < 2000; i+=2) {
			somatorio+=i;
			contador++;
		}
		System.out.println("Média: "+(somatorio/contador));
	}

}
