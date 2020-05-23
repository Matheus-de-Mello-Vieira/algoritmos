package Conteudo11;

import java.util.Scanner;

import jdk.management.resource.internal.TotalResourceContext;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//valor hora trabalhada igual
		
		//entrada:
		//nome, função, quantidade de horas
		
		//quanto receber = horas trabalhadas x valor da hora + premio
		
		System.out.println("Seja bem vindo a calculadora da folha de pagamento! ");
		System.out.println("Insira FIM como nome para terminar o programa");
		
		System.out.println("Insira o valor da hora trabalhada: ");
		double valorHora = Integer.parseInt(entrada.nextLine());
		int numeroDePessoas = 0;
		int somatorioHoras = 0;
		String nome = "";
		
		int maiorSalario = 0;
		String nomeMaiorSalario = "";
		String funcaoMaiorSalario = "";
		
		int pessoasAte100 = 0;
		int pessoas100ate500 = 0;
		int pessoasAcima500 = 0;
		
		double somatorioTotal = 0;
		do {
			System.out.println("Insira o nome: ");
			nome = entrada.nextLine();
			
			if(!nome.equals("FIM")) {
				System.out.println("Insira a função: ");
				String funcao = entrada.nextLine();
				
				System.out.println("Insira a quantidade de horas:");
				int horas = Integer.parseInt(entrada.nextLine());
				
				double total = horas * valorHora;
				
				if(horas<100) {
					total+=1000;
					pessoasAte100++;
				}else if (horas<=500) {
					total+=10 * horas;
					pessoas100ate500++;
				}else {
					total+=100 * (horas/10);
					pessoasAcima500++;
				}
				
				System.out.println("Valor a receber: "+total);
				
				numeroDePessoas++;
				somatorioHoras+=horas;
				
				if(maiorSalario<horas) {
					maiorSalario = horas;
					nomeMaiorSalario = nome;
					funcaoMaiorSalario = funcao;
				}
				
				somatorioTotal+=total;
			}
			
			System.out.println("Média de horas trabalhadas: "+((double)somatorioHoras)/numeroDePessoas);
			System.out.println("Nome da pessoa com maior salário: "+nomeMaiorSalario);
			System.out.println("Função da pessoa com maior salário: "+funcaoMaiorSalario);
			
			System.out.println("Pessoas na faixa até 100: "+pessoasAte100);
			System.out.println("Pessoas na faixa 100 até 500: "+pessoas100ate500);
			System.out.println("Pessoas na faixa acima 500: "+pessoasAcima500);
			
			System.out.println("Valor total: "+somatorioTotal);
			
		}while(!nome.equals("FIM"));
	}
}
