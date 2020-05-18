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
			
			System.out.print("Insira a quantidade de Gols do Atlético: ");
			int golsAltletico = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Insira a quantidade de Gols do Cruzeiro: ");
			int golsCruzeiro = entrada.nextInt();
			entrada.nextLine();
			
			//resolução do item a
			if(golsAltletico>golsCruzeiro) {
				//resolução do item a
				System.out.println("Equipe vencedora: Altlético");
				
				//resolução do item b
				quantidadeVitoriasAtletico++;
				
				//resolução do item c
				somatorioDeGolsQuandoAtleticoGanhou+=golsAltletico;
			}else if(golsCruzeiro>golsAltletico) {
				//resolução do item a
				System.out.println("Equipe vencedora: Cruzeiro");
				
				//resolução do item b
				quantidadeVitoriasCruzeiro++;
			}else{
				System.out.println("Empate ");
			}
			
			//resolução do item d
			//Math.abs(x) = |x| (valor absoluto)
			int diferencaDoPlacarAtual = Math.abs(golsAltletico-golsCruzeiro);
			if(diferencaDoPlacarAtual>maiorDiferencaDePlacar) {
				maiorDiferencaDePlacar = diferencaDoPlacarAtual;
			}
			
		}
		//resolução do item b
		System.out.println("Quantidade de vitórias do Atlético: "+quantidadeVitoriasAtletico);
		System.out.println("Quantidade de vitórias do Cruzeiro: "+quantidadeVitoriasCruzeiro);
		
		//resolução do item c
		System.out.println("Média de gols do Atlético quando ele venceu a partida: " + (somatorioDeGolsQuandoAtleticoGanhou/quantidadeVitoriasAtletico));
		
		//resolução do item d
		System.out.println("Maior diferença de placar: "+maiorDiferencaDePlacar);
		
		//resolução do item e
		if(quantidadeVitoriasAtletico>quantidadeVitoriasCruzeiro) {
			System.out.println("Equipe ganhadora: Atlético");
		}else if(quantidadeVitoriasAtletico<quantidadeVitoriasCruzeiro) {
			System.out.println("Equipe ganhadora: Cruzeiro");
		}else {
			System.out.println("Equipes empatadas");
		}
		entrada.close();
	}
}
