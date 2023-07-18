import java.util.Scanner;

public class QuadUrav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);


        double sum = x1+x2;
        double divide = x1*x2;
        System.out.println(String.format("%.1f", sum) + " " + String.format("%.1f", divide));

    }


}
