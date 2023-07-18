import java.util.Scanner;

public class ArrEvenArr {
    /*На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
Выведите на печать массив в одной строке, через пробел.
Посчитайте и выведите на печать сумму элементов массива.
Sample Input:
10
Sample Output:
2 4 6 8 10
30
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int summ = 0;

        for (int i = 2; i <= n; i += 2) {
            count++;
        }

        int[] arr2 = new int[count];
        for (int j = 2, i = 0; j <= n; j += 2, i++) {
            arr2[i] = j;
            summ += j;

            System.out.print(arr2[i]);

            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\n" + summ);
    }
}

