package Conteudo13;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] meses = new String[12];
		
		for (int i = 0; i < meses.length; i++) {
			System.out.print("Insira o nome: ");
			meses[i] = entrada.nextLine();
		}
		
		for (int i = meses.length - 1; i >= 0 ; i--) {
			System.out.println(meses[i]);
		}
		
		entrada.close();
	}

}
