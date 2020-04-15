package Conteudo8;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o número de insumos utilizados: ");
		int numeroInsumos = entrada.nextInt(); entrada.nextLine();
		String nomeDoMaiorCusto="";
		int maiorCustoParcial = 0;
		int somatorio = 0;
		for(int i = 0;i < numeroInsumos;i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Insira a quantidade: ");
			int precoParcial = entrada.nextInt(); entrada.nextLine();
			
			System.out.print("Insira o preço unitário: R$");
			precoParcial*= entrada.nextDouble(); entrada.nextLine();
			
			if(precoParcial>maiorCustoParcial) {
				nomeDoMaiorCusto = nome;
				maiorCustoParcial = precoParcial;
			}
			
			somatorio+=precoParcial;
		}
		
		System.out.println("Custo total: "+somatorio);
		System.out.println("Custo total: "+somatorio/(double)numeroInsumos);
		System.out.println("O nome do insumo de maior custo parcial: "+nomeDoMaiorCusto);
		entrada.close();
	}

}
