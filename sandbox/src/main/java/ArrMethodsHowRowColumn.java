import java.util.Scanner;

public class ArrMethodsHowRowColumn {
    /*На вход подаётся матрица (двумерный массив).
    Все элементы матрицы - целые числа.
    Найдите её размеры и выведите на печать в соответсвии с примером.

Sample Input 1:
1 2 3
4 5 6
7 8 9
Sample Output 1:
Строк: 3
Столбцов: 3
Sample Input 2:
1 2
3 4
5 6
7 8
Sample Output 2:
Строк: 4
Столбцов: 2
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

        // Print the number of rows and columns in the 2D array
        System.out.println("Строк: " + str2.length + "\n" + "Столбцов: " + str2[0].length);
    }
}

