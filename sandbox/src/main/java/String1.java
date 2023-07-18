import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char a = str1.charAt(0);
        String str2 = sc.next();
        char b = str2.charAt(0);


        while (sc.hasNext()) {
            String str3 = sc.next();
            char c = str3.charAt(0);
            char d = str3.charAt(str3.length() - 1);

            if (a <= c && b >= c) {

                System.out.println(str3);

            }
        }
    }
}
/*
j p
java python c++ kotlin php sql http css javascript r go
*/
