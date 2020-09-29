package Aula02;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt(); // 5

        if(n > 10) { //  true --> verdadeiro
            //início do escopo do if
            System.out.println("Parabéns! Você digitou o número certo!");
        } else {//fim do escopo do if
            //início do escolo do else
            System.out.println("Você digitou o número errado!");
        } //fim do escopo do else


        System.out.println("Fim!");
    }
}
