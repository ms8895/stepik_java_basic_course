import java.util.Arrays;
import java.util.Scanner;

public class ArrMethods {
    /*
На вход подаётся натуральное число n,
затем несколько целых чисел, разделённых пробелом,
а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
Sample Input:
5
3 12 1 22 17
3
Sample Output:
12
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr);

        int k = sc.nextInt();

        if (k > 0 && k <= arr.length) {
            System.out.println(arr[k - 1]);
        } else if (k == 0) {
            System.out.println(arr[k]);

        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
