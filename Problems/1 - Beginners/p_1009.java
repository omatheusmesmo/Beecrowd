import java.util.Scanner;

public class p_1009 {
    public static void main(String[] args){
        String nome;
        double salario, vendas, total;

        Scanner sc = new Scanner(System.in);
        
        nome = sc.next();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        total = salario + (vendas*0.15);    
        
        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}
