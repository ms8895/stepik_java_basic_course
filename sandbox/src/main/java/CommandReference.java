import java.util.Scanner;

public class CommandReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String com = sc.next();

        switch (com) {
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;

            case "if":
                System.out.println("Это условный оператор");
                break;

            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;

            default:
                System.out.println("Раздел в разработке");

        }

    }
}
