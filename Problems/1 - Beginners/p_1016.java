import java.util.Scanner;

public class p_1016 {
    public static void main(String[] args) {
        int km, tempo;
        Scanner sc = new Scanner(System.in);

        km = sc.nextInt();
        tempo = km*2;

        System.out.printf("%d minutos\n", tempo);

        sc.close();
    }
}