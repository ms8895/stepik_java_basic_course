import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while ((n = sc.nextInt()) != 0) {
            sum += n;
        }
        System.out.print(sum);
    }
}
