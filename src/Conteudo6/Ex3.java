package Conteudo6;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor mensal das vendas: ");
		double valorMensal = entrada.nextDouble();
		if(valorMensal<=1000) {
			System.out.println("Salário: R$240");
		}else {
			if(valorMensal<10000) {
				System.out.printf("Salário: R$%.2f",240+valorMensal*0.1);
			}else {
				System.out.println("Salário: R$1240");
			}
		}
		entrada.close();
	}

}
