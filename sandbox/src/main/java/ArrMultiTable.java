import java.util.Arrays;
import java.util.Scanner;

public class ArrMultiTable {
    public static void main(String[] args) {
/*
Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили,
что таблица умножения иногда весьма полезна для программистов, и решили её выучить. Помогите нашим индийским друзьям!

На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
Sample Input:
3 4
Sample Output:
1 2 3 4
2 4 6 8
3 6 9 12
*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrN = new int[n];
        int[] arrM = new int[m];
//Два цикла заполняют одномерные массивы
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = i + 1;
        }
        for (int i = 0; i < arrM.length; i++) {
            arrM[i] = i + 1;
        }

        //Элемент массива arrN пермножается с элементом arrM, добавляется в многомерный массив и вывод элемента
        int[][] arrNM = new int[n][m];
        for (int i = 0; i < arrNM.length; i++) {
            for (int j = 0; j < arrNM[i].length; j++) {
                arrNM[i][j] = arrN[i] * arrM[j];
                System.out.print(arrNM[i][j]);
                if (j < arrNM[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
//Вывод двумерного массива
        System.out.println(Arrays.deepToString(arrNM));

    }
}
