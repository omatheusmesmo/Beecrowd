import java.util.Scanner;

public class p_1021 {
    public static void main(String[] args) {
        double entrada;
        int n100, n50, n20, n10, n5, n2, m100, m50, m25, m10, m05, m01;

        Scanner sc = new Scanner(System.in);

        entrada = sc.nextInt();
        //contagem notas
        n100 = (int) (entrada/100);
        entrada %= 100;
        System.out.printf("%d notas de 100\n", n100);

        n50 =  (int) (entrada/50);
        entrada %= 50;
        System.out.printf("%d notas de 100\n", n50);

        n20 =  (int) entrada/20;
        entrada %= 20;
        System.out.printf("%d notas de 100\n", n20);

        n10 =  (int) entrada/10;
        entrada %= 10;
        System.out.printf("%d notas de 100\n", n10);
        
        n5 =  (int) entrada/5;
        entrada %= 5;
        System.out.printf("%d notas de 100\n", n5);

        n2 =  (int) entrada/2;
        entrada %= 2;
        System.out.printf("%d notas de 100\n", n2);

        //contagem moeda
        m100 = (int) (entrada/1);


        sc.close();
    }
}
