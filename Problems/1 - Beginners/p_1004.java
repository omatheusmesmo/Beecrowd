import java.util.Scanner;

public class p_1004 {
    public static void main (String[] args){
        int a, b, prod;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        
        prod = a * b;
        System.out.printf("PROD = %d\n", prod);
        sc.close();
    }    
}
