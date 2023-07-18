import java.util.Scanner;

public class MathPiPrec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double p = Math.PI;
        double scale = Math.pow(10, n);


        if (0 < n && n <= 10) {

            System.out.println(Math.round(p * scale) / scale);


            //String formatted = String.format("%." + n + "f", p);
            //System.out.println(formatted);

        } else if (n == 0) {
            System.out.println((int) (Math.round(p * scale) / scale));

        }
    }
}