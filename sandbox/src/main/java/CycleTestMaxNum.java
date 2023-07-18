import java.util.Arrays;
import java.util.Scanner;

public class CycleTestMaxNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //Фиксированный массив с длиной строки
        int[] numStr = new int[str.length()];


        for (int i = 0; i <= str.length() - 1; i++) {
            //Добавление элемента строки в массив
            numStr[i] = Character.getNumericValue(str.charAt(i));
        }
        //Сортировка массива
        Arrays.sort(numStr);
        System.out.println(numStr[str.length() - 1]);
    }
}
