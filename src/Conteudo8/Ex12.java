package Conteudo8;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int faturamento = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println("Insira o modelo: ");
			int codigo = entrada.nextInt();
			
			switch (codigo) {
			case 1:
				faturamento+=1565;
				break;

			case 2:
				faturamento+=1890;
				break;
			case 3:
				faturamento+=2150;
				break;
			case 4:
				faturamento+=2963;
				break;

			case 5:
				faturamento+=3750;
				break;
		}
			
		System.out.println("Faturamento: "+faturamento);
		entrada.close();
		}
	}
}
