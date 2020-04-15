package Conteudo8;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 0;k<20;k++) {
			for(int i = 1;i<16;i++) {
				for (int j = 0; j < 8 - Math.abs(i - 8); j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}