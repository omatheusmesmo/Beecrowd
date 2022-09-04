import java.util.Scanner;

public class p_1001 {
    public static void main(String[] args) {
        int a, b, x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        a = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        b = sc.nextInt();

        x = a+b;
        System.out.printf("X=%d\n", x);

        sc.close();
    }
}
