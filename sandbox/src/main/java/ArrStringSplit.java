import java.util.Scanner;

public class ArrStringSplit {
    /*На вход подаётся строка из элементов, разделённых запятой.
    Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
Sample Input:
1,2,3,4,5
Sample Output:
1
2
3
4
5*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(",");
        for (String word : words) {
            System.out.println(word);
        }
    }
}