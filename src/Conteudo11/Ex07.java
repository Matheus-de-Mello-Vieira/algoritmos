package Conteudo11;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menorTemperatura = 1000;//n�o pode ter um flag 0, pois � uma temperatura perfeitamente possivel
		int maiorTemperatura = 0;
		int somatorio = 0;
		int diasComMaiorTemperatura = 0;
		for (int i = 0; i < 121; i++) {
			System.out.println("Insira a temperatura: ");
			int temperatura = entrada.nextInt();
			
			if(menorTemperatura>temperatura) {
				menorTemperatura = temperatura;
			}
			if(maiorTemperatura<temperatura) {
				maiorTemperatura = temperatura;
				diasComMaiorTemperatura=1;
			}else if(maiorTemperatura==temperatura){
				diasComMaiorTemperatura++;
			}
			somatorio+=temperatura;
			
		}
		
		System.out.println("Menor temperatura: "+menorTemperatura);
		System.out.println("Maior temperatura: "+maiorTemperatura);
		
		System.out.println("M�dia das temperaturas"+somatorio/121.0);
		System.out.println("Dias com maior temperatura: "+diasComMaiorTemperatura);
		entrada.close();
	}
}
