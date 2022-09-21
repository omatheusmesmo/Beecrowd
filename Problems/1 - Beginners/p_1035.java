import java.util.Scanner;

public class p_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ( a%2==0 ) {
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceitos");
        }

        sc.close();        
    }
}