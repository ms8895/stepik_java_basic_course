import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ArrMethodsUnionString {
/*
На ввод подаются несколько строк текста. Вначале подаётся число n - количество строк, а затем сами строки.
Знаки препинания удалены.
Образуйте многомерный массив слов из этих строк и выведите его на печать.

Примечание. В ходе работы вы можете столкнуться с проблемой вроде этого:
[]
[Не, пей, вина, Гертруда]
[Быть, или, не, быть]
[Бедный, Йорик]
Это важный вопрос, связанный с особенностями работы методов ввода nextInt()  и nextLine().
Попробуйте самостоятельно разобраться и решить эту проблему.

Sample Input:
4
Не пей вина Гертруда
Быть или не быть
Бедный Йорик
Неладно что-то в датском королевстве
2
Не пей вина Гертруда
Быть или не быть

Sample Output:
[Не, пей, вина, Гертруда]
[Быть, или, не, быть]
[Бедный, Йорик]
[Неладно, что-то, в, датском, королевстве]
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[][] arr = new String[n][];
       // System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine().split(" ");

            System.out.println(Arrays.deepToString(arr[i]));
          //  System.out.println(Arrays.deepToString(arr));

        }
        System.out.println(Arrays.deepToString(arr));
    }
}
/*
4
Не пей вина Гертруда
Быть или не быть
Бедный Йорик
Неладно чтото в датском королевстве


4
ewfw
wef
ыуа
ыкпц

*/
