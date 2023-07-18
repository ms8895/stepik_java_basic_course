import java.util.Scanner;

public class EqualSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //На вход подаётся два числа - a и b. Выведите знак отношения между
        // числами:
        // один символ "<", если a < b,
        // ">",если a > b
        // и "=", если a=b.

        if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }
    }
}

