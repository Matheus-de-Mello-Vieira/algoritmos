package Conteudo6;
import java.util.Scanner;

public class Ex17{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Você tem curso técnico em programação? ");
		boolean cursoTecnico = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Você tem curso superior de programação? ");
		boolean cursoSuperior = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Você tem menos de 3 anos de experiência em programação? ");
		boolean experiencia = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Você se considera uma pessoa criativa? ");
		boolean criativa = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Você prefere liderar a ser liderado? ");
		boolean lideranca = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Você preferre trabalhar sozinho a em equipe? ");
		boolean sozinho = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Você é autodidata? ");
		boolean autodidata = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Você aceitaria uma remuneração incial de R$ 1500?");
		boolean remuneracao = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
		boolean local = entrada.nextLine().charAt(0)=='V'?true:false;

		if(criativa && !sozinho && autodidata&&(cursoTecnico&&!cursoSuperior&&!experiencia)&&!(lideranca && remuneracao)) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
