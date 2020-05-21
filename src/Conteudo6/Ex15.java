package Conteudo6;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o cógido do pacote: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Insira os dias de consumo de PPP: ");
		int dias = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Insira os extras: ");
		double conta = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Insira sua cidade: ");
		String cidade = entrada.nextLine();

		System.out.println(conta);
		switch (codigo) {
		case 1:
			conta += 65;// valor fixo
			conta += dias > 54 ? 65 : 1.2 * dias;
			// 54 porque, 54 * 1.2 = 64.8 e 55 * 1.2 = 66
			break;
		case 2:
			conta += 104;// valor fixo
			conta += 2.1 * dias;
			break;

		case 3:
			conta += 137;
			break;
		default:
			System.out.println("Insira um código valido. Eu não reconheci o código " + codigo
					+ ", mas a culpa não é minha, por favor não me larga.");
			break;
		}

		if (cidade.equalsIgnoreCase("Belo Horizonte")) {

		} else if (cidade.equalsIgnoreCase("São paulo")) {
			conta *= 1.01;
		} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
			conta *= 1.015;
		} else {
			conta *= 1.02;
		}

		System.out.printf("Conta: %.2f", conta);
		entrada.close();
	}

}
