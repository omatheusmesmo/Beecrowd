import java.util.Scanner;

public class p_1017 {
    public static void main(String[] args){
        int tempo, velMedia, deslocamento;
        double litros;
        Scanner sc = new Scanner(System.in);

        tempo = sc.nextInt();
        velMedia = sc.nextInt();

        deslocamento = tempo*velMedia;

        litros =  (deslocamento * 1.0) / 12;

        System.out.printf("%.3f\n", litros);

        sc.close();
    }
}