package Conteudo7;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o nome das equipes: ");
		String equipe = entrada.nextLine();
		
		switch (equipe) {
		case "Am�rica":
		case "Atl�tico":
		case "Cruzeiro":
		case "Villa Nova":
			System.out.println("Estado: Minas Gerais");
			break;
		
		case "Botafogo":
		case "Flamengo":
		case "Fluminense":
		case "Vasco":
			System.out.println("Estado: Rio de Janeiro");
			break;
		
		case "Corinthians":
		case "Palmeiras":
		case "Santos":
		case "S�o Paulo":
			System.out.println("Estado: S�o Paulo");
			
		case "Gr�mio":
		case "Internacional":
		case "Juventude":
			System.out.println("Estado: Rio Grande do Sul");
			
		case "N�utico":
		case "Santa Cruz":
		case "Sport":
			System.out.println("Estado: Pernambuco");
		default:
			System.out.println("Time n�o encontrado");
			break;
		}
		entrada.close();
	}

}
