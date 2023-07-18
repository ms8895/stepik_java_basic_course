import java.util.Scanner;

public class CorrectDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();


        if ((day > 0 && day <= 31) && (month > 0 && month <= 12) && year > 0) {

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && (day <= 29)) {
                    System.out.println("true");
                } else if (day <= 28) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

            } else if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) && (day <= 31)) {
                System.out.println("true");

            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 30)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } else {
            System.out.println("false");
        }
    }
}
