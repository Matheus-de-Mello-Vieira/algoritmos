package Conteudo12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void calcular(double angulo) {
		angulo = Math.toRadians(angulo);
		System.out.println("Seno: "+Math.sin(angulo));
		System.out.println("Cosseno: "+Math.cos(angulo));
		System.out.println("Tangente: "+Math.tan(angulo));
		System.out.println("Arco seno: "+Math.asin(angulo));
		System.out.println("Arco consseno: "+Math.acos(angulo));
		System.out.println("Arco tangente: "+Math.atan(angulo));
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o ângulo: ");
		double angulo = entrada.nextDouble();
		
		calcular(angulo);
		entrada.close();
	}
}
