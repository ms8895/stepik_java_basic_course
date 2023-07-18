import java.util.Scanner;

public class ArrDiagonal {
    /*На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
Напечатайте главную диагональ матрицы в одной строке, через пробел.
Sample Input:
1 2 3
4 5 6
7 8 9
Sample Output:
1 5 9
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (sc.hasNextInt()) {
            String str = sc.nextLine();
            String[] b = str.split(" ");
            System.out.print(b[x] + " ");
            if (x < b.length - 1) {
                x++;
            } else {
                break;
            }
        }
    }
}

