import java.util.Scanner;

public class p_1014 {
    public static void main(String[] args) {
        int valor;
        double distancia, consMedio;

        Scanner sc = new Scanner(System.in);

        valor = sc.nextInt();
        distancia = sc.nextDouble();
        consMedio = valor / distancia;

        System.out.printf("%.3f km/l\n", consMedio);

        sc.close();        
    }
}
