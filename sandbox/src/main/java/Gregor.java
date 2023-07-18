import java.util.Scanner;

public class Gregor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isLeapYear(number));
    }

    public static int isLeapYear(int number) {
        int count = 0;

        for (int x = 0; x <= number; x++) {
            boolean result = number % 4 == 0 && number % 100 != 0 || number % 400 == 0;
            if (result) {
                count++;
            }

            return count;
        }

        return count;
    }

}
