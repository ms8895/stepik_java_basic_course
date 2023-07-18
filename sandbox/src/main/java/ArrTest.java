import java.util.Scanner;

public class ArrTest {
    public static void main(String[] args) {
/*На вход подаётся целое число n,
а на следующей строке - последовательность целых чисел через пробел,
Выведите число с индексом n.
Если числа с таким индексом нет, выведите "Неверный ввод".
Sample Input:
4
1 1 2 3 5 8

-1
1 1 2 3 5 8
0
1 1 2 3 5 8
Sample Output:
5
*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strNum = sc.nextLine().split(" ");


        if (strNum.length > n && n >= 0) {
            System.out.println(strNum[n]);
        } else {
            System.out.println("Неверный ввод");
        }
    }
}