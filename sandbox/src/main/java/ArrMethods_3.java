import java.util.Arrays;
import java.util.Scanner;

public class ArrMethods_3 {

    /*На ввод подаётся последовательность целых чисел.
    Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.),
    кроме первого и последнего.
    Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
Sample Input:
1 2 3 4 5 6
Sample Output:
1 3 2 5 4 6
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrStr = sc.nextLine().split(" ");
        String[] arrStrCopy = Arrays.copyOf(arrStr, arrStr.length);

        int countArrStr = arrStr.length;
        if (countArrStr > 2) {
            for (int i = 1; i < countArrStr - 2; i += 2) {
                arrStrCopy[i + 1] = arrStr[i];
                arrStrCopy[i] = arrStr[i + 1];
            }
        }
        int countArrStrCopy = 0;
        for (String i : arrStrCopy) {
            System.out.print(i);
            if (countArrStrCopy < countArrStr) {
                System.out.print(" ");
            } else {
                break;
            }
            countArrStrCopy++;
        }
    }
}
