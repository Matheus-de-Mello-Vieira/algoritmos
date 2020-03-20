package Conteudo5;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double pontos[][] = new double[2][2];
		
		for(int i=0;i<2;i++) {
			System.out.print("Informe o x do ponto "+(i+1)+ ": ");
			pontos[i][0] = entrada.nextDouble();
			
			System.out.print("Informe o y do ponto "+(i+1) + ": ");
			pontos[i][1] = entrada.nextDouble();
		}
		System.out.printf("Distância entre os pontos (%.2f,%.2f) e (%.2f,%.2f) é %.4f", pontos[0][0],pontos[0][1],pontos[1][0],pontos[1][1],Math.sqrt(Math.pow(pontos[0][0]-pontos[1][0], 2)+Math.pow(pontos[0][1]-pontos[1][1], 2)));
		entrada.close();
	}

}
