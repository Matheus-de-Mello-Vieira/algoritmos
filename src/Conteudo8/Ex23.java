package Conteudo8;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 0;
		double anterior=2;
		for (int i = 1; i < 100; i+=2) {
			valor+=anterior/3;
			anterior*=4;
		}
		System.out.println(valor);
	}

}