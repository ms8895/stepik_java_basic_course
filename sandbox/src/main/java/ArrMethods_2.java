import java.util.Arrays;
import java.util.Scanner;

public class ArrMethods_2 {
    /*На вход подаётся последовательность целых чисел.
    Создайте из этой последовательности массив чисел,
    отсортированный по возрастанию,
    и выведите на печать.

    Sample Input:
    3 6 2 14 1
    Sample Output:
    [1, 2, 3, 6, 14]
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Заполняем массив строк
        String[] arrStr = sc.nextLine().split(" ");
//From строкового заполняем числовой
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
    }
}

