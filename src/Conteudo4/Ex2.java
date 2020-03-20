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
    private static String preencher(String texto, int caracteres){
        for (int i = texto.length(); i < caracteres; i++) {
            texto=texto+".";
        }
        return texto+" ";
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Insira o CPF: ");
        String CPF = entrada.nextLine();
        
        System.out.print("Insira o identidade: ");
        String identidade = entrada.nextLine();
        
        System.out.print("Insira o título de eleitor: ");
        String tituloEleitor = entrada.nextLine();
        
        System.out.print("Insira o carteira de motorista: ");
        String carteiraMotorista = entrada.nextLine();
        
        System.out.print("Insira o nome da empresa: ");
        String nomeEmpresa = entrada.nextLine();
        
        System.out.print("Insira o salário: ");
        int salario = entrada.nextInt();
        
        System.out.println();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println(preencher("CPF. ", 50)+CPF);
        System.out.println(preencher("C.I. ", 50)+identidade);
        System.out.println(preencher("Título de eleitor. ", 50)+tituloEleitor);
        System.out.println(preencher("Carteira de motorista. ", 50)+carteiraMotorista);
        System.out.println();
        System.out.println("Empresa: "+nomeEmpresa);
        System.out.println("Salário: R$ "+salario);
        entrada.close();
    }
}
