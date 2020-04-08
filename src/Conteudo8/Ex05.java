package Conteudo8;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);	
		int votosFulano = 0;
		int votosCiclano = 0;
		int votosBeltrano = 0;
		int votosBranco = 0;
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Vote: ");
				int voto = entrada.nextInt();

				switch (voto) {
				case 1:
					if(votosFulano!=-1) {
						votosFulano++;
					}else {
						votosBranco++;
					}
					break;

				case 2:
					if(votosCiclano!=-1) {
						votosCiclano++;
					}else {
						votosBranco++;
					}
					break;

				case 3:
					if(votosBeltrano!=-1) {
						votosBeltrano++;
					}else {
						votosBranco++;
					}
					break;
				default:
					votosBranco++;
				}
			}
			System.out.println("Fulano: "+(votosFulano!=-1?votosFulano:"Não competindo"));
			System.out.println("Ciclano: "+(votosCiclano!=-1?votosCiclano:"Não competindo"));
			System.out.println("Beltrano: "+(votosBeltrano!=-1?votosBeltrano:"Não competindo"));
			if(Math.max(Math.max(votosFulano, votosCiclano),votosBeltrano)>votosBranco) {
				if(votosFulano>votosCiclano) {
					if(votosFulano>votosBeltrano) {
						System.out.println("Vencedor: Fulano");
						System.exit(0);
					}else if(votosFulano == votosBeltrano){
						System.out.println("Segundo turno");
						votosFulano=0;
						votosBeltrano=0;
						votosCiclano=-1;
					}else {
						System.out.println("Vencedor: Beltrano");
						System.exit(0);
					}
				}else if(votosFulano==votosCiclano) {
					if(votosFulano > votosBeltrano) {
						System.out.println("Segundo turno");
						votosFulano=0;
						votosBeltrano=-1;
						votosCiclano=0;
					}else if (votosFulano == votosBeltrano){
						System.out.println("Segundo turno");
						votosFulano=0;
						votosBeltrano=0;
						votosCiclano=0;
					}else {
						System.out.println("Vencedor: Beltrano");
						System.out.println("Segundo turno");
						votosFulano=0;
						votosCiclano=0;
						votosBeltrano=-1;
					}
				}else {
					if(votosCiclano>votosBeltrano) {
						System.out.println("Vencedor: Ciclano");
						System.exit(0);
					}else if(votosCiclano == votosBeltrano){
						System.out.println("Segundo turno");
						votosBeltrano=0;
						votosCiclano=0;
						votosFulano=-1;
					}else {
						System.out.println("Vencedor: Beltrano");
						System.exit(0);
					}
				}
			}else {
				System.err.println("Eleição anulada");
				System.exit(0);
			}
		}
		entrada.close();
	}
}