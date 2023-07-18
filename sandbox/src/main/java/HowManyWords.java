import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (sc.hasNext()==true) {
            String word = sc.next();
            sum += 1;
        }
        System.out.print(sum);
    }
}
