import java.util.Scanner;

public class ForSubsequence2 {
    public static void main(String[] args) {

//При вводе 5 выведет 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                    if (j == n) {
                        break;
                    }
                }
            }
        }
    }
}
