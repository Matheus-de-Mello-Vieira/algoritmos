package Conteudo13;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] placasDosCarros = new String[100];
		String[] nomesDosDonos = new String[placasDosCarros.length];
		
		for (int i = 0; i < placasDosCarros.length; i++) {
			System.out.print("Insira o nome: ");
			nomesDosDonos[i] = entrada.nextLine();
			
			System.out.println("Insira a placa de carro: ");
			placasDosCarros[i] = entrada.nextLine();
		}
		
		System.out.print("Insira o alvo: ");
		String alvo = entrada.nextLine();
		
		System.out.print("Número da vaga: ");
		if(alvo.matches("\\d")) {
			//toda placa de carro tem número,um nome nunca tem um número
			for (int i = 0; i < placasDosCarros.length; i++) {
				if(alvo == placasDosCarros[i]) {
					System.out.println(i);
				}
			}
		}else {
			for (int i = 0; i < nomesDosDonos.length; i++) {
				if(alvo == nomesDosDonos[i]) {
					System.out.println(i);
				}
			}
		}
		entrada.close();
	}

}
