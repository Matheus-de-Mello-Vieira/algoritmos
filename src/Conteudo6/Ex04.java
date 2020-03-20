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
			System.out.println(nome+" está desnutrido(a)");
		}else if(IMC<20) {
			System.out.println(nome+" está abaixo do peso");
		}else if(IMC<=25) {
			System.out.println(nome+" está no peso ideal");
		}else if(IMC<27) {
			System.out.println(nome+" está acima do peso");
		}else {
			System.out.println(nome+" está obeso(a)");
		}
		entrada.close();
	}

}
