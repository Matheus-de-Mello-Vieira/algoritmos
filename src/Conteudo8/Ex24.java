package Conteudo8;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 0;k<10;k++) {
			for(int i = 1;i<21;i++) {
				for (int j = 0; j < (i<=10?i:21-i); j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}