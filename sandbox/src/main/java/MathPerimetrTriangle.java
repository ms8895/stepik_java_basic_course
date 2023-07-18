import java.util.Scanner;

public class MathPerimetrTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double koren = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
        double perimetr = (double) Math.round(koren + x + y);

        System.out.println(perimetr);

    }
}
