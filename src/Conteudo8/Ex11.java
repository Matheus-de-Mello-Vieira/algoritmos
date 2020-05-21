package Conteudo8;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int quantidade_de_mulheres_loiras_olhos_azuis_idade_entre_18_25_anos_solteiras_salario_maior_10000 = 0;

		double maiorSalario = 0;
		String nomeMaiorSalario = "";

		double menorSalario = 0;
		String nomeMenorSalario = "";
		for (int i = 0; i < 50; i++) {
			System.out.print("Insira o nome: ");
			String nome = entrada.nextLine();

			System.out.print("Insira a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Insira o sexo: ");
			char sexo = entrada.nextLine().charAt(0);
			// M = masculino
			// F = feminino

			System.out.print("Insira o estado Civil: ");
			char estadoCivil = entrada.nextLine().charAt(0);
			// C = casado
			// S = solteiro
			// O = outros

			System.out.println("Insira a cor dos olhos: ");
			char corDosOlhos = entrada.nextLine().charAt(0);
			// A = azul
			// C = castanho
			// P = preto
			// O = outros
			System.out.print("Insira a cor dos cabelos: ");
			char corDosCabelos = entrada.nextLine().charAt(0);
			// L = Loiro
			// P = Preto
			// C = Castanho
			// R = Ruivo

			System.out.print("Insira o salário: R$");
			double salario = entrada.nextDouble();
			entrada.nextLine();

			System.out.println("Insira a escolaridade: ");
			int escolaridade = entrada.nextInt();
			entrada.nextLine();

			if (sexo == 'F' && corDosCabelos == 'L' && corDosOlhos == 'A' && idade >= 18 && idade < 25
					&& estadoCivil == 'S' && salario > 10000 && escolaridade == 4) {
				quantidade_de_mulheres_loiras_olhos_azuis_idade_entre_18_25_anos_solteiras_salario_maior_10000++;
			}

			if (salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}

			if (salario < menorSalario || menorSalario == 0) {
				menorSalario = salario;
				nomeMenorSalario = nome;
			}
		}
		System.out.println(
				"Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000 e curso superior completo: "
						+ quantidade_de_mulheres_loiras_olhos_azuis_idade_entre_18_25_anos_solteiras_salario_maior_10000);
		System.out.println("Nome da pessoa com maior salário: " + nomeMaiorSalario);
		System.out.println("Diferença entre maior e menos salário: " + (maiorSalario - menorSalario));
		entrada.close();
	}

}
