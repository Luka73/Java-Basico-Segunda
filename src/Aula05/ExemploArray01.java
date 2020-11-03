package Aula05;

public class ExemploArray01 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 7; //index
        numeros[1] = 3;
        numeros[2] = 0;
        numeros[3] = 5;
        numeros[4] = 2;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        for(int i = 0; i <= 4; i++) {
            System.out.println(numeros[i]);
        }
    }
}
