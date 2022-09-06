import java.util.Scanner;

public class p_1011 {
    public static void main(String[] args){
        double raio, volume, pi;

        Scanner sc = new Scanner(System.in);

        pi = 3.14159;
        raio = sc.nextDouble();
        raio = Math.pow(raio, 3);
        volume = (4/3.0)*pi*raio;

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}