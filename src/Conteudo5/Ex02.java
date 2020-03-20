package Conteudo5;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		double raio = entrada.nextDouble();
		System.out.print("Área: ");
		System.out.printf("%.2f\n",12.5664*Math.pow(raio, 2));
		System.out.print("Volume: ");
		System.out.printf("%.2f\n",4.1888*Math.pow(raio, 3));
		entrada.close();
	}

}
