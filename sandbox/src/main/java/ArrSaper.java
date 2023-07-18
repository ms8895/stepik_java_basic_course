import java.util.Arrays;
import java.util.Scanner;

public class ArrSaper {
    /*Заполните поле для игры Сапёр.
На вход подаются натуральные числа m и n - размеры игрового поля, затем k - количество мин,
далее координаты мин - x и y для каждой мины, нумерация координат начинается с единицы.
Необходимо вывести на печать игровое поле:
- если в клетке расположена мина, выведите для этой клетки "m" (латиница);
- если в клетке мины нет, нужно посчитать, сколько мин расположено в соседних клетках (включая угловые и боковые),
и вывести для этой клетки посчитанное число.

Примечание. Каждая строка оканчивается символом (не пробелом!).
Sample Input 1:
3 2
3
1 1
2 2
3 2
Sample Output 1:
m 2
3 m
2 m
Sample Input 2:
3 3
1
1 1
Sample Output 2:
m 1 0
1 1 0
0 0 0
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.nextLine().replace(" ", "");

        int m = Integer.parseInt(String.valueOf(mn.charAt(0)));
        int n = Integer.parseInt(String.valueOf(mn.charAt(1)));
        String[][] cordMines = new String[m][n];

        String countK = sc.nextLine();
        int countMines = Integer.parseInt(String.valueOf(countK.charAt(0)));

        String cordinatesXY;
        /*String xy = "";

        while (sc.hasNextInt()) {
            cordinatesXY = sc.nextLine().replace(" ", "");

            if (cordinatesXY.isEmpty()) {
                break;
            }
            xy = xy + cordinatesXY;
        }
        System.out.println(cordMines.length + " " + cordMines[0].length);
        System.out.println(countMines);
        System.out.println(xy);

        int indexNum = 0;

        for (int i = 0; i < cordMines.length; i++) {
            for (int j = 0; j < cordMines[i].length; j++) {
                cordMines[i][j] = String.valueOf(xy.charAt(indexNum));
                indexNum += 1;
            }
        }
        System.out.println(Arrays.deepToString(cordMines));*/

        int[][] field = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(field));

        if (countMines > 0) {

            for (int i = 0; i < countMines; i++) {
                cordinatesXY = sc.nextLine().replace(" ", "");

                int x = Integer.parseInt(String.valueOf(cordinatesXY.charAt(0)));
                int y = Integer.parseInt(String.valueOf(cordinatesXY.charAt(1)));
                field[x - 1][y - 1] = 1;
            }
        }
        System.out.println(Arrays.deepToString(field));

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {

                if (field[i][j] == 1) {
                    sb.append("m" + " ");
                } else {
                    int xLeft = i == 0 ? 0 : i - 1;
                    int xRight = i + 1 >= m ? i : i + 1;
                    int topY = j == 0 ? 0 : j - 1;
                    int bottomY = j + 1 >= n ? j : j + 1;

                    int countMineNeib = 0;

                    for (int l = xLeft; l <= xRight; l++) {
                        for (int o = topY; o <= bottomY; o++) {
                            if (!(l == i && o == j) && field[l][o] == 1) {
                                countMineNeib++;
                            }
                        }
                    }
                    sb.append(countMineNeib).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}




/*
3 2
3
1 1
2 2
3 2
*/