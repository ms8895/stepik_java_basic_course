import java.util.Scanner;

public class ForNum1n {

    public static void main(String[] args) {
//Последовательность чисел до n, / без остатка на 2 и 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            if (n < 6) {
                System.out.println("Таких чисел нет");
                break;
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}