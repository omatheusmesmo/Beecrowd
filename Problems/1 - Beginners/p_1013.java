import java.util.Scanner;

public class p_1013 {
    public static void main(String[] args){
        int a, b, c, mAB, mABC;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        mAB = (a+b+Math.abs(a-b))/2;
        mABC = (mAB+c+Math.abs(mAB-c))/2;

        System.out.printf("%d eh o maior\n", mABC);

        sc.close();
    }
}
