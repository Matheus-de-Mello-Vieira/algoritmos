package Conteudo6;
import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a produ��o de bolas: ");
		int numeroBolas = entrada.nextInt();
		System.out.print("Insira a quantidade de bolas com defeito: ");
		numeroBolas-= entrada.nextInt();
		System.out.print("Insira o pre�o unit�rio da caixa de papel�o: ");
		double precoCaixa = entrada.nextDouble();
		System.out.print("Insira o aluguel mensal: ");
		double aluguel = entrada.nextDouble();
		System.out.print("Insira quantos meses faltam para a copa: ");
		aluguel*= entrada.nextInt();
		
		int numeroDeCaixas = numeroBolas/10;
		int numeroGalpao = numeroDeCaixas/850;
		
		if(numeroBolas%10>0) {
			numeroBolas++;
		}
		
		if(numeroGalpao%850>0) {
			numeroGalpao++;
		}
		
		System.out.println(numeroDeCaixas*precoCaixa + numeroGalpao*aluguel);
		entrada.close();
	}

}
