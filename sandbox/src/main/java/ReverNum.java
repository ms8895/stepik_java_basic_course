import java.util.Scanner;

public class ReverNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = 0;

        while (n != 0) {
            x = n % 10;
            System.out.print(x);
            n = (n - x) / 10;
        }
    }
}
