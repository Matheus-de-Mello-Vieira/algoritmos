package Conteudo6;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de poluente: ");
		double quantidadePoluente = entrada.nextDouble();
		
		if(quantidadePoluente<=1500) {
			System.out.println("Multa: R$ 0");
		}else {
			if(quantidadePoluente<=3500) {
				System.out.println("Multa: R$3000");
			}else {
				System.out.printf("Multa: R$%.2f",5000*quantidadePoluente);
			}
		}
			
		entrada.close();
	}

}
