import java.util.Scanner;

public class WhileRaiting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 0 && n <= 10) {
                sum += n;
                count++;
            } else {
                break;
            }
        }
        System.out.println(sum / count);
    }
}
