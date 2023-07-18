import java.util.Scanner;

public class MathRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int round = 5;
        double scale = Math.pow(10, round);

        double num = ((Math.pow(Math.pow(x, y), 1.0 / n)));

        double result = Math.round(num * scale) / scale;

        System.out.println(result);
    }
}
