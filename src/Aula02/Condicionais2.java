package Aula02;

import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt(); //0, 7, 13, 65, 72
        String nome = sc.next();

        // n == 18
        // || --> pipe pipe (OU)
        // && --> (E)

        if(n == 7 && nome.equals("Maria")) {
            System.out.println("Parabéns, Maria! Vc Acertou!");
        }

        if(n == 0 || n == 1) { //qualquer número que não zero
            System.out.println("Parabéns! Você digitou 0");
        } else if(n == 7) { //achei!
            System.out.println("Parabéns! Você digitou 7");
        } else if(n == 13) {
            System.out.println("Parabéns! Você digitou 13");
        } else if(n == 65) {
            System.out.println("Parabéns! Você digitou 65");
        } else if(n == 72) {
            System.out.println("Parabéns! Você digitou 72");
        } else {
            System.out.println("Você não acertou nenhum número!");
        }

        if(nome.equals("Maria")) {
            System.out.println("Parabéns! Maria!");
        }
    }
}
