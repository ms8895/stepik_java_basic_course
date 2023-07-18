import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //put your code here
       /* Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc1.nextLine();
        String c = sc2.nextLine();

        System.out.println(c + ":" + b + ":" + a);*/

        Scanner nameScanner = new Scanner (System.in);
        String ye = nameScanner.next();
        String mm = nameScanner.next();
        String dd = nameScanner.next();
        System.out.print(dd + ":" + mm + ":" + ye);
    }
}
