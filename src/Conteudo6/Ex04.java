package Conteudo6;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Insira a altura (em metros): ");
		double altura = entrada.nextDouble();
		
		System.out.print("Insira o peso (em kg)");
		double peso = entrada.nextDouble();
		
		double IMC = peso/Math.pow(altura, 2);
		
		if(IMC<18) {
			System.out.println(nome+" est� desnutrido(a)");
		}else if(IMC<20) {
			System.out.println(nome+" est� abaixo do peso");
		}else if(IMC<=25) {
			System.out.println(nome+" est� no peso ideal");
		}else if(IMC<27) {
			System.out.println(nome+" est� acima do peso");
		}else {
			System.out.println(nome+" est� obeso(a)");
		}
		entrada.close();
	}

}
