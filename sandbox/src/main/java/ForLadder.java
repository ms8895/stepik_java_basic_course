import java.util.Scanner;

public class ForLadder {
    public static void main(String[] args) {

        /*
        Напечатайте "лесенку" из чисел от единицы до n, n > 0.
        Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).

        Sample Input: 3
        Sample Output:
        1
        1 2
        1 2 3
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j != i) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}