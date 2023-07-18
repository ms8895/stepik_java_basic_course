import java.util.Scanner;

public class ArrMethods_4 {
    public static void main(String[] args) {
        /*Дана последовательность целых чисел.
        Определите минимальную сумму пар элементов массива, расстояние (разница) между индексами которых равно 2.
        Если таких пар нет, выведите 0.
Sample Input:
8 7 6 5 4 3 2
Sample Output:
6
*/
        Scanner sc = new Scanner(System.in);
//Заполняем массив строк
        String[] arrStr = sc.nextLine().split(" ");
//Из строкового заполняем числовой
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        int result = 0;
        if (arrInt.length > 2) {
            result = arrInt[0] + arrInt[2];
            for (int i = 0; i < arrInt.length - 2; i++) {
                if (arrInt[i] + arrInt[i + 2] < result) {
                    result = arrInt[i] + arrInt[i + 2];
                }
            }
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
