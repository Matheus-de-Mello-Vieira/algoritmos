package testes;

public class aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 1;
		switch (valor) {// 1

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:// 2

			System.out.println("FAIXA DE NÚMEROS ÍMPARES DE 1 A 9");

			break;

		case 10:
		case 15:
		case 20:
		case 25:
		case 30:

			System.out.println("FAIXA DE NÚMERO MÚLTIPLOS DE 5");

			break;

		case 100:
		case 200:// 3

			System.out.println("FAIXA DE NÚMEROS ENTRE 100 E 200");

			break;

		default: // 4

			System.out.println("NENHUMA FAIXA");

			break;

		}

	}

}
