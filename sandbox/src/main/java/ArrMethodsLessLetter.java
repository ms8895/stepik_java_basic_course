import java.util.Scanner;

public class ArrMethodsLessLetter {
    /*На вход подаётся строка текста.
    Определите, в каком по счёту слове этого предложения меньше всего букв,
    и выведите на печать.
    Если таких слов несколько, выведите номер первого по порядку.

    Sample Input:
    Java is good
    Sample Output:
    2*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrStr = sc.nextLine().split(" ");

        int min = arrStr[0].length();
        int index = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() < min) {
                min = arrStr[i].length();
                index = i;
            }
        }
        System.out.println(index + 1);
        /*for (String word : arrStr) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        System.out.println(min);*/
    }
}
