package Conteudo8;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a altura: ");
		double altura = entrada.nextDouble();
		altura*=altura;
		
		System.out.println("| Peso\t| IMC\t| Situação Corpórea");
		for(int i = 60;i<101;i++) {
			
			double imc = i/altura;
			System.out.printf("| %d\t| %.2f\t| ",i,imc);
			if(imc<20) {
				System.out.println("abaixo do peso");
			}else if(imc<=25) {
				System.out.println("peso ideal");
			}else {
				System.out.println("acima do peso");
			}
		}
		entrada.close();
	}

}
