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
public class Ex3 {

    private static String linhaCompleta(int colunas, char caractere) {
        String result = "";
        for (int i = 0; i < colunas; i++) {
            result = result + caractere;
        }
        return result;
    }

    private static String centralizar(int colunas, String texto) {
        if (texto.length() > colunas) {
            return texto;
        } else {
            //o número de colunas e texto devem ser ou os dois pares, ou os dois impares
            if (texto.length() % 2 != colunas % 2) {
                texto = " " + texto;
            }
            String espacamento = "";
            //Dessa forma, (colunas-texto.length())/2 sempre será par, mas vou usar um Math.round para evitar erros (se o java bugar na hora de dividir)
            for (int i = 0; i < Math.round((colunas - texto.length()) / 2); i++) {
            	espacamento = espacamento + " ";
            }
            return espacamento + texto + espacamento;
        }
    }

    private static String direita(int caracteres, String texto) {
        for (int i = texto.length(); i < caracteres; i++) {
            texto = texto + " ";
        }
        return texto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int colunas = 79;
        int valores[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o " + (i+1) + "º valor:");
            valores[i] = entrada.nextInt();
        }

        System.out.println("|"+linhaCompleta(colunas, '=')+"|");
        System.out.println("|"+centralizar(colunas, "Quantidade de Poluente Emitido x Valor de Multa")+"|");
        System.out.println("|"+linhaCompleta(colunas, '-')+"|");
        System.out.println("|"+direita(colunas, " Até "+valores[0]+" multa de R$ "+valores[2])+"|");
        System.out.println("|"+linhaCompleta(colunas, '-')+"|");
        System.out.println("|"+direita(colunas, " Entre "+valores[0]+" e "+valores[1]+" multa de R$ "+valores[3])+"|");
        System.out.println("|"+linhaCompleta(colunas, '-')+"|");
        System.out.println("|"+direita(colunas, " Acima de "+valores[1]+" multa de R$ "+valores[4]+" por poluente emitido")+"|");
        System.out.println("|"+linhaCompleta(colunas, '=')+"|");
        entrada.close();
    }
}
