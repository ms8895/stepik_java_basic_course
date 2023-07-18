import java.util.Arrays;
import java.util.Scanner;

public class Arr90Degrees {
    /*На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
    Поверните матрице на 90 градусов по часовой стрелке.
    Sample Input:
1 2 3
4 5 6
7 8 9

1 2 3 4
5 6 7 8
Sample Output:
7 4 1
8 5 2
9 6 3
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        String str = "";
        int countStr = 0;
        int countCol = 0;

        // Read lines and remove spaces until input is provided
        while (sc.hasNextInt()) {
            input = sc.nextLine().replace(" ", "");

            if (input.isEmpty()) {
                break;
            }
            str = str + input;

            countCol = input.length();
            countStr++;
        }

        // Create a 2D array to store the characters
        String[][] str2 = new String[countStr][countCol];

        int indexNum = 0;

        // Fill the array with characters from the input string
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2[i].length; j++) {
                str2[i][j] = String.valueOf(str.charAt(indexNum));
                indexNum += 1;
            }
        }

        // Rotate and print the st2
        for (int j = 0; j < countCol; j++) {
            for (int i = countStr - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(str2[i][j] + " ");
                } else {
                    System.out.print(str2[i][j]);
                }
            }
            System.out.println();
        }
    }
}

