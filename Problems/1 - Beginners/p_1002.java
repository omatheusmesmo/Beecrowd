import java.util.Scanner;

public class p_1002 {
    public static void main(String[] args) {
        double area, raio, pi;
        pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        
        raio = sc.nextDouble();
        area = pi*(raio*raio);
        sc.close();

        System.out.printf("A=%.4f\n", area);
        
    }
}