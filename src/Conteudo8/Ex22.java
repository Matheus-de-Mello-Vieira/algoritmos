package Conteudo8;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade = 0;
		long somatorio = 0;
		for (int i = 1000; i < 10000; i++) {
			if(i/1000 == i%10 &&
					(i/100)%10 == (i/10)%10) {
				somatorio+=i;
				quantidade++;
			}
		}
		System.out.println("M�dia: "+somatorio/quantidade);
	}

}
