import java.util.Scanner;

public class CycleOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//Последовательность чисел от a до b
        if (a <= b) {

            for (int i = 0; a + i <= b; i++) {

                if ((a + i) % 2 != 0) {
                    System.out.print(a + i);

                    if (b - 1 == a + i || b == a + i) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        } else if (b < a) {

            for (int i = 0; b + i <= a; i++) {

                if ((b + i) % 2 != 0) {
                    System.out.print(b + i);

                    if (a - 1 == b + i || a == b + i) {
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
