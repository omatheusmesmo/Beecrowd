import java.util.Scanner;

public class p_1019 {
    public static void main(String[] args){
        int N, horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        horas = N/3600;
        N %= 3600;
        minutos = N/60;
        N %= 60;
        segundos = N/1;

        System.out.printf("%d:%d:%d", horas,minutos, segundos);

        sc.close();
    }
}
