package prova;

import java.util.Scanner;

public class E01419B {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeVitoriasCruzeiro = 0;
		int quantidadeVitoriasAtletico = 0;
		
		int somatorioDeGolsQuandoAtleticoGanhou = 0;
		int maiorDiferencaDePlacar = 0;
		for (int i = 0; i < 545; i++) {
			System.out.print("Insira a data: ");
			String data = entrada.nextLine();
			
			System.out.print("Insira a quantidade de Gols do Atl�tico: ");
			int golsAltletico = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Insira a quantidade de Gols do Cruzeiro: ");
			int golsCruzeiro = entrada.nextInt();
			entrada.nextLine();
			
			//resolu��o do item a
			if(golsAltletico>golsCruzeiro) {
				//resolu��o do item a
				System.out.println("Equipe vencedora: Altl�tico");
				
				//resolu��o do item b
				quantidadeVitoriasAtletico++;
				
				//resolu��o do item c
				somatorioDeGolsQuandoAtleticoGanhou+=golsAltletico;
			}else if(golsCruzeiro>golsAltletico) {
				//resolu��o do item a
				System.out.println("Equipe vencedora: Cruzeiro");
				
				//resolu��o do item b
				quantidadeVitoriasCruzeiro++;
			}else{
				System.out.println("Empate ");
			}
			
			//resolu��o do item d
			//Math.abs(x) = |x| (valor absoluto)
			int diferencaDoPlacarAtual = Math.abs(golsAltletico-golsCruzeiro);
			if(diferencaDoPlacarAtual>maiorDiferencaDePlacar) {
				maiorDiferencaDePlacar = diferencaDoPlacarAtual;
			}
			
		}
		//resolu��o do item b
		System.out.println("Quantidade de vit�rias do Atl�tico: "+quantidadeVitoriasAtletico);
		System.out.println("Quantidade de vit�rias do Cruzeiro: "+quantidadeVitoriasCruzeiro);
		
		//resolu��o do item c
		System.out.println("M�dia de gols do Atl�tico quando ele venceu a partida: " + (somatorioDeGolsQuandoAtleticoGanhou/quantidadeVitoriasAtletico));
		
		//resolu��o do item d
		System.out.println("Maior diferen�a de placar: "+maiorDiferencaDePlacar);
		
		//resolu��o do item e
		if(quantidadeVitoriasAtletico>quantidadeVitoriasCruzeiro) {
			System.out.println("Equipe ganhadora: Atl�tico");
		}else if(quantidadeVitoriasAtletico<quantidadeVitoriasCruzeiro) {
			System.out.println("Equipe ganhadora: Cruzeiro");
		}else {
			System.out.println("Equipes empatadas");
		}
		entrada.close();
	}
}
