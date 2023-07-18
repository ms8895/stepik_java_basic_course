import java.util.Scanner;

public class ArrSaper_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.nextLine().replace(" ", "");

        int m = Integer.parseInt(String.valueOf(mn.charAt(0)));
        int n = Integer.parseInt(String.valueOf(mn.charAt(1)));
        int[][] arrMN = new int[m][n];
    }
}
