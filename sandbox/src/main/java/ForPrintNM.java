import java.util.Scanner;

public class ForPrintNM {
    public static void main(String[] args) {
//Print n m раз
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        for (int i = 1; i <= m; i++) {
            System.out.print(n + " ");
        }
    }
}
