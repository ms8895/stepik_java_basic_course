import java.util.Scanner;

public class DivElev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sumAll = 0;
        int sum3 = 0;

        while ((n = sc.nextInt()) % 11 == 0) {
            sumAll += 1;
            if (n % 3 == 0) {
                sum3 += n;
            }
        }
        System.out.println(sumAll + "\n" + sum3);
    }
}
