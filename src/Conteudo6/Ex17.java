package Conteudo6;
import java.util.Scanner;

public class Ex17{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Voc� tem curso t�cnico em programa��o? ");
		boolean cursoTecnico = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Voc� tem curso superior de programa��o? ");
		boolean cursoSuperior = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Voc� tem menos de 3 anos de experi�ncia em programa��o? ");
		boolean experiencia = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Voc� se considera uma pessoa criativa? ");
		boolean criativa = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Voc� prefere liderar a ser liderado? ");
		boolean lideranca = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Voc� preferre trabalhar sozinho a em equipe? ");
		boolean sozinho = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Voc� � autodidata? ");
		boolean autodidata = entrada.nextLine().charAt(0)=='V'?true:false;
		
		System.out.print("Voc� aceitaria uma remunera��o incial de R$ 1500?");
		boolean remuneracao = entrada.nextLine().charAt(0)=='V'?true:false;
		entrada.close();
		
		System.out.print("Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH? ");
		boolean local = entrada.nextLine().charAt(0)=='V'?true:false;

		if(criativa && !sozinho && autodidata&&(cursoTecnico&&!cursoSuperior&&!experiencia)&&!(lideranca && remuneracao)) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
