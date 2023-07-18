import java.util.Scanner;

public class MathEPI {
    public static void main(String[] args) {


        double x = Math.E;
        double y = Math.PI;

        if (Math.pow(x, y) > Math.pow(y, x)) {
            System.out.println(">");
        } else if (Math.pow(x, y) < Math.pow(y, x)) {
            System.out.println("<");

        } else {
            System.out.println("=");
        }
    }
}
