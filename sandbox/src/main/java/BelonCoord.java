import java.util.Scanner;

public class BelonCoord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x < 0 && x <= y && y <= 2 - x * x) {
            System.out.println("Yes");
        } else if (x >= 0 && y >= 0 && y <= 2 - x * x) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}

