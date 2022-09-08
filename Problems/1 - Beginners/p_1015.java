import java.util.Scanner;

public class p_1015 {
    public static void main(String[] args){
        double x1, x2, y1, y2, dist;

        Scanner sc = new Scanner(System.in);

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.printf("%.4f\n",dist);

        sc.close();
    }
}
