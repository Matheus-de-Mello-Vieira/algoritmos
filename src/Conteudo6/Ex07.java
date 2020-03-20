package Conteudo6;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o salário: ");
		double salario = entrada.nextDouble();
		double PLBruto= 0;
		double sobreSalario = 0;
		if(salario<300) {
			PLBruto+=500;
			PLBruto+=salario*0.7;
		}else if(salario<1000) {
			PLBruto+=200;
			PLBruto+=salario*0.5;
		}else {
			PLBruto+=salario*0.3;
		}
		
		System.out.print("Participação liquida:"+0.75*(PLBruto));
		entrada.close();
	}

}
