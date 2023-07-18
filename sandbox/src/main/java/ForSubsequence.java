import java.util.Scanner;

public class ForSubsequence {
    public static void main(String[] args) {
/*
Предположим, что мы работаем с последовательностью такого вида:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.
Sample Input:
5
Sample Output:
1 2 2 3 3
 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n > 0) {
            int x = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (x <= n) {
                        System.out.print(i + " ");
                        x++;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
