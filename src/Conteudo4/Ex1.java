package Conteudo4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String primeiroNome, nomeNoMeio, sobreNome;
		int idade;

		System.out.println("");
		System.out.print("Insira o primeiro nome: ");
		primeiroNome = entrada.nextLine();
		System.out.print("Insira o nome do meio: ");
		nomeNoMeio = entrada.nextLine();
		System.out.print("Insira o sobrenome: ");
		sobreNome = entrada.nextLine();
		System.out.print("Insira a idade:");
		idade = entrada.nextInt();

		System.out.println(sobreNome + ", " + primeiroNome + " " + nomeNoMeio);
		System.out.println("Idade: " + idade);

		entrada.close();
	}

}
