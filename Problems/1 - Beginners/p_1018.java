import java.util.Scanner;

public class p_1018 {
    public static void main(String[] args) {
        int totalSc,total, n100, n50, n20, n10, n5, n2, n1;
        Scanner sc = new Scanner(System.in);

        totalSc = sc.nextInt();
        total = totalSc;

        n100 = total / 100;
        total %= 100;
        n50 = total /50;
        total %= 50;
        n20 = total /20;
        total %= 20;
        n10 = total /10;
        total %= 10;
        n5 = total /5;
        total %= 5;
        n2 = total /2;
        total %= 2;
        n1 = total /1;

        System.out.println(totalSc);
        System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", n100, n50, n20, n10, n5, n2, n1);

        sc.close();
        
    }
}
