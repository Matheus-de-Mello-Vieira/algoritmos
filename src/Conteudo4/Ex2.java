package Conteudo4;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author mello
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Insira o CPF: ");
        String CPF = entrada.nextLine();
        
        System.out.print("Insira o identidade: ");
        String identidade = entrada.nextLine();
        
        System.out.print("Insira o t√≠tulo de eleitor: ");
        String tituloEleitor = entrada.nextLine();
        
        System.out.print("Insira o carteira de motorista: ");
        String carteiraMotorista = entrada.nextLine();
        
        System.out.print("Insira o nome da empresa: ");
        String nomeEmpresa = entrada.nextLine();
        
        System.out.print("Insira o sal·rio: ");
        int salario = entrada.nextInt();
        
        System.out.println();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println();
        System.out.println("Documentos:");
        
        System.out.println("CPF. ............................................."+CPF);
        System.out.println("C.I. ............................................."+identidade);
        System.out.println("TÌtulo de eleitor. ..............................."+tituloEleitor);
        System.out.println("Carteira de motorista. ..........................."+carteiraMotorista);
        System.out.println();
        System.out.println("Empresa: "+nomeEmpresa);
        System.out.println("Sal·rio: R$ "+salario);
        entrada.close();
    }
}
