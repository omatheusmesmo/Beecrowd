import java.util.Scanner;

public class p_1021 {
    public static void main(String[] args) {
        float entrada;
        int n100, n50, n20, n5, n2, m100, m50, m25, m10, m05, m01;

        Scanner sc = new Scanner(System.in);

        entrada = sc.nextInt();
        //contagem notas
        n100 = entrada/100;
        entrada %= 100;
        n50 = entrada/50;
        entrada %= 50;
        n20 = entrada/20;
        entrada %= 20;
        n5 = entrada/5;
        entrada %= 5;
        n2 = entrada/2;
        //contagem moeda
        m100 = entrada/


        sc.close();
    }
}