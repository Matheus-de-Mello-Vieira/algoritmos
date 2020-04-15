package Conteudo7;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o número de vitórias: ");
		int vitorias = entrada.nextInt();
		
		System.out.print("Prêmio: ");
		if(vitorias<=5) {
			System.out.println("Nenhum");
		}else if(vitorias<=10) {
			System.out.println("Outro cartão");
		}else if(vitorias==11) {
			System.out.println("R$ 100");
		}else if(vitorias==12) {
			System.out.println("R$ 1.000");
		}else if(vitorias==13) {
			System.out.println("R$ 50.000,00");
		}
		entrada.close();
	}

}
