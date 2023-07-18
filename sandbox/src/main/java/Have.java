import java.util.Scanner;

public class Have {
    public static void main(String[] args) {
        int x = 1;
        if (x >= 100 && x < 1000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        if (str.contains(str2)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }
}
