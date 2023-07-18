import java.util.Scanner;

public class CycleTestPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 1) {

            int count = 0;
            for (int i = 1; i <= a; i++) {

                if (a % i == 0) {
                    count++;
                    if (count > 2) {
                        System.out.println(false);
                        break;
                    }
                }

            }
            if (count == 2) {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
}
