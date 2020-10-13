package Aula02;

import java.util.Scanner;
public class ExemploBooleano {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano para saber se é ou nao bissexto:");
        int ano = scan.nextInt();
        int resto4 = ano % 4;
        int resto100 = ano % 100;
        int resto400 = ano % 400;

        if ((resto4 != 0 && resto100 == 0) || (resto400 != 0))
            System.out.println("O ano " + ano + " não é bissexto.");
        else
            System.out.println("O ano " + ano + " é bissexto.");

        //(resto4 == 0 && resto100 != 0) || (resto400 == 0) --> ano bissexto
        // v --> bissexto                       f --> bissexto

        //(resto4 != 0 && resto100 == 0) && (resto400 != 0) --> NÃO é ano bissexto
        // f --> f                               f --> f

        //Inscrição carteira de motorista
        // (CPF) OU (RG) --> (NÃO CPF) E (NÃO RG)
    }
}
