package Conteudo5;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o sal�rio: ");
		double salario = entrada.nextDouble();

		System.out.print("Informe o n�mero de dependentes: ");
		double numeroDeDependentes = entrada.nextDouble();

		double liquido = salario - numeroDeDependentes * 60;
		System.out.printf("L�quido = $%.2f \nImposto de renda = $%.2f", liquido, liquido * 0.15);
		entrada.close();
	}

}
