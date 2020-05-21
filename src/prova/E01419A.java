package prova;

public class E01419A {
	public static void main(String[] args) {
		System.out.print("Números: ");
		for (int i = 1; i <= 9; i++) {
			int centenaAoQuadrado = (int) Math.pow(i, 2);
			for (int j = 0; j <= i; j++) {
				Double resultado = Math.sqrt(centenaAoQuadrado - Math.pow(j, 2));
				// verificar se deu um número inteiro
				if (resultado.intValue() == resultado) {
					System.out.print(String.valueOf(i) + String.valueOf(j) + resultado.intValue() + " ");
				}
			}
		}
	}
}
