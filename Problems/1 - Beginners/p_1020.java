import java.util.Scanner;

public class p_1020 {
    public static void main(String[] args) {
        int n, anos, meses, dias;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        anos = n/365;
        n %= 365;
        meses = n/30;
        n %= 30;
        dias = n;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

        sc.close();        
    }
}
