package Aula02;

import java.util.Scanner;

public class Captura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = sc.next(); //captura o texto da tela (input)

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = sc.nextDouble();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
    }
}
