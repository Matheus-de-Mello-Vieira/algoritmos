package Conteudo8;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numeroPessoasMenos18anos = 0;
		int numeroPessoasMaior18anos = 0;
		for(int i = 0; i<50;i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();
			System.out.print("Insira a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();
			
			if(idade<18) {
				numeroPessoasMenos18anos++;
			}else {
				numeroPessoasMaior18anos++;
			}
		}
		
		System.out.println("Número de pessoas com idade inferior a 18 anos: "+numeroPessoasMenos18anos);
		System.out.println("Número de pessoas com idade superior a 18 anos: "+numeroPessoasMaior18anos);
		entrada.close();
	}
}
