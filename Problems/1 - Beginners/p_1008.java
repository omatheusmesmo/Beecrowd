import java.util.Scanner;

public class p_1008 {
    public static void main (String[] args){
        int cod, horas;
        double valor, total;

        Scanner sc = new Scanner(System.in);

        cod = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        total = valor * horas;

        System.out.printf("NUMBER = %d\n", cod);
        System.out.printf("SALARY = U$ %.2f\n", total);

        sc.close();
    }
}
