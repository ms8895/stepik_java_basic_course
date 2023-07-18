import java.util.Scanner;

public class SortString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String c1 = c.toLowerCase();
        /*
        a > b > c
        a > b < c
        b>a>c
        b>a<c
        c>a>b
        c>a<b
a p
b j
c c

*/
        if (a1.compareTo(b1) < 0 && a1.compareTo(c1) < 0) {
            if (b1.compareTo(c1) < 0) {
                System.out.println(a + "\n" + b + "\n" + c);
            } else {
                System.out.println(a + "\n" + c + "\n" + b);
            }

        } else if (b1.compareTo(a1) < 0 && b1.compareTo(c1) < 0) {
            if (a1.compareTo(c1) < 0) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else {
                System.out.println(b + "\n" + c + "\n" + a);
            }

        } else if (c1.compareTo(a1) < 0 && c1.compareTo(b1) < 0) {
            if (a1.compareTo(b1) < 0) {
                System.out.println(c + "\n" + a + "\n" + b);
            } else {
                System.out.println(c + "\n" + b + "\n" + a);
            }
        }
    }
}