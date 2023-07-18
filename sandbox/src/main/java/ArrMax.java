import java.util.Arrays;
import java.util.Scanner;

public class ArrMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
//        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}