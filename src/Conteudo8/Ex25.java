package Conteudo8;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 0; k < 10; k++) {
			for (int i = 1; i < 21; i++) {
				for (int j = 0; j < (i <= 10 ? i : 21 - i) - 1; j++) {
					System.out.print(' ');
				}
				System.out.println("*");
			}
		}
	}

}