import java.util.Scanner;

public class p_1012 {
    public static void main(String[] args){
        double a, b, c, total, pi;
        Scanner sc = new Scanner(System.in);

        pi = 3.14159;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        total = (a*c)/2; //TRIANGULO
        System.out.printf("TRIANGULO: %.3f\n", total);
        
        total = c*c*pi; //CIRCULO
        System.out.printf("CIRCULO: %.3f\n", total);
        
        total = (a+b)*c/2; //trapezio
        System.out.printf("TRAPEZIO: %.3f\n", total);
        
        total = b*b; //quadrado
        System.out.printf("QUADRADO: %.3f\n", total);
        
        total = a*b; //retangulo
        System.out.printf("RETANGULO: %.3f\n", total);

        sc.close();
    }
}
