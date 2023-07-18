import java.util.Scanner;

public class HasNum {
    public static void main(String[] args) {
        int x = 1;
        if (x >= 100 && x < 1000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());

        if ((a >= 100 && a < 1000) && (b >= 0 && b < 10)) {
            char aStr = Integer.toString(a).charAt(1);
            char bStr = Integer.toString(b).charAt(0);

            if (aStr == bStr) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } else {
            System.out.println("error");
        }

        if ((a >= 100 && a < 1000) && (b >= 0 && b < 10)) {
            int c = (a % 100) / 10;
            if (c == b) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } else {
            System.out.println("error");
        }
    }
}
