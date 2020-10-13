package Aula04;

public class LoopInfinito {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // 6 x 0 = 0
    // 6 x 1 = 6
    // 6 x 2 = 12
    // 6 x 3 = 18
    // 6 x 4 = 24
    // 6 x 5 = 30
    // 6 x 6 = 36
    // 6 x 7 = 42
}
