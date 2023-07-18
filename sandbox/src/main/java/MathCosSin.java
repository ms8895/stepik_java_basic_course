import java.util.Scanner;

public class MathCosSin {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        double y = Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(x));


        System.out.println(y);
    }
}
