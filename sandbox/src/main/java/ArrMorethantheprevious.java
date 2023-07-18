import java.util.ArrayList;
import java.util.Scanner;

public class ArrMorethantheprevious {
    /*
На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел.
Выведите на печать все числа, большие предыдущего числа.

Sample Input:
7
8 3 6 3 4 3 12
Sample Output:
6 4 12
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                arrayList.add(arr[j + 1]);
            }
        }
        for (int number : arrayList) {
            System.out.print(number + " ");
        }
    }
}

