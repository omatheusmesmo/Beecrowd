import java.util.Scanner;

public class p_1046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hI, hF, total;

        hI = sc.nextInt();
        hF = sc.nextInt();

        if ( hI > hF || hI == hF){
            total = 24-hI+hF;
        } else {
            total = hF-hI;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", total); 

        sc.close();

    }
}