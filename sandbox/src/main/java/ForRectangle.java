import java.util.Scanner;

public class ForRectangle {
    public static void main(String[] args) {

//На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
