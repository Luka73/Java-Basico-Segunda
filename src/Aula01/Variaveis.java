package Aula01;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Pedro"); //String
        System.out.println("28"); //String --> texto
        System.out.println(28); // int --> integer (números inteiros)
        System.out.println(28.5); // double --> números com casas decimais
        //as casas são marcadas com ponto e não com vírgula

        System.out.println(true); // boolean --> lógico
        System.out.println(false);

        System.out.println("Pedro " + "28"); // + --> concatenação = Juntar!!
        System.out.println(28 + 10); // 38
        System.out.println("28" + "10"); // 2810
        System.out.println("28" + 10); // 2810

        String nome = "Pedro";
        int idade = 28;
        double altura = 1.78;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(nome + " tem " + idade + "anos");

    }
}
