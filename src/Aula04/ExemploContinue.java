package Aula04;

public class ExemploContinue {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            if(i % 3 == 0) { // é divísivel por 3
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }

    // continue e break --> param uma estrutura!
}
