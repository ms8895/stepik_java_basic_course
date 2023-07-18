import java.util.Arrays;
import java.util.Scanner;

public class ArrCreate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        for (int j = 0; j <= arr.length-1; j++) {
            System.out.print(arr[j]);
            if (j == arr.length - 1) {
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
}
