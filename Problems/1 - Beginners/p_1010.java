import java.util.Scanner;

public class p_1010 {
    public static void main(String[] args){
        int cod1, quant, cod2;
        double valor, total;

        Scanner sc = new Scanner(System.in);
        
        cod1 = sc.nextInt();
        quant = sc.nextInt();
        valor = sc.nextDouble();

        total = valor*quant;

        cod2 = sc.nextInt();
        quant = sc.nextInt();
        valor = sc.nextDouble();

        total = total + valor*quant;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
