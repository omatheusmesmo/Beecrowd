import java.util.Scanner;

public class p_1003 {
    public static void main(String[] args) {
        int a, b, x;

        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        
        b = sc.nextInt();

        x = a+b;
        System.out.printf("SOMA = %d\n", x);

        sc.close();
    }
}