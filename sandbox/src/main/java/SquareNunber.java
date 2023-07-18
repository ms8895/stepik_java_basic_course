import java.util.Scanner;

public class SquareNunber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 1;
        int y = 0;

        while (y < n) {
            y = x * x;
            if (y <= n) {
                System.out.print(y + " ");
            }
            x += 1;
        }
    }
}
