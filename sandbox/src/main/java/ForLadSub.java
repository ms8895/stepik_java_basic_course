import java.util.Scanner;

public class ForLadSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int x = 1;
                for (int j = 1; j <= i; j++) {
                    for (int k = 1; k <= j; k++) {
                        if (x <= i) {
                            System.out.print(j);
                        }
                        if (x < i) {
                            System.out.print(" ");
                        }
                        x++;
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
