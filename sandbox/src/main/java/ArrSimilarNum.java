import java.util.Scanner;

public class ArrSimilarNum {
    /*На ввод подаётся последовательность целых чисел.
    Выведите те из них, которые встречаются в последовательности только один раз.
    Числа нужно вывести в одной строке, через пробел, в том же порядке, как они поступили на ввод.
Sample Input:
16 3 0 3 2 11 2
Sample Output:
16 0 11
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strNum = sc.nextLine().split(" ");

        for (int i = 0; i < strNum.length; i++) {
            String elem = strNum[i];
            int index = 0;
            int count = 0;
            while (index < strNum.length) {
                if (strNum[index].equals(elem)) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
                index++;
            }
            if (count == 1) {
                System.out.print(strNum[i] + " ");
            }
        }
    }
}