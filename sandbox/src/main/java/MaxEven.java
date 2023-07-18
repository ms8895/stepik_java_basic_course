import java.util.Scanner;

public class MaxEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            if (a >= b && a >= c) {
                System.out.println(a);
            } else if (b >= a && b >= c) {
                System.out.println(b);
            } else if (c > a && c > b) {
                System.out.println(c);
            }
            //000   >>
            //100
            //010
            //001
            //110
            //011
            //101
            //111

        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 == 0) {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a % 2 == 0 && b % 2 != 0 && c % 2 == 0) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (a % 2 == 0 && b % 2 == 0 && c % 2 != 0) {
            if (a >= b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println(c);

        } else if (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println(a);

        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println(b);

        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println("Чётных чисел нет");

        }
    }
}

