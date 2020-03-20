package Conteudo6;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o capital aplicado: ");
		double capitalAplicado = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Insira o número de dias: ");
		int numeroDeDia = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Insira a taxa diária: ");
		double taxaDiaria = Double.parseDouble(entrada.nextLine().replace("%", ""))/100;
		
		System.out.printf("Valor resgatado: %.2f", capitalAplicado * (1 + 0.85*taxaDiaria*numeroDeDia) - 10);
		entrada.close();
	}

}
