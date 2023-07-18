import java.util.Scanner;

public class MathDegree {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        double z = Math.pow(x, y);

        System.out.println(z);
    }

}
