package Conteudo8;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 0; k < 20; k++) {
			for (int i = 1; i < 16; i++) {
				for (int j = 0; j < Math.pow(2, 7 - Math.abs(i - 8)); j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}