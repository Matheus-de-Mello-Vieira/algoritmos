package Conteudo12;

import java.util.function.BinaryOperator;


public class Ex03 {
	public static int pegarDigito(int numero, int digito) {
			return numero/(int)Math.pow(10, digito-1)%10;
	}
	public static void main(String[] args) {
		int n = 98765;
		int i = 3;
				
		System.out.println(pegarDigito(n, i));;
	}
}
