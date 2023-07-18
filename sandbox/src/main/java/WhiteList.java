import java.util.Scanner;

public class WhiteList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        String a = "Джефф Безос";
        String b = "Илон Маск";
        String c = "Марк Цукерберг";
        String d = "Билл Гейтс";

        String f = str.contains(a.toLowerCase()) ? "Добро пожаловать!" :
                str.contains(b.toLowerCase()) ? "Добро пожаловать!" :
                        str.contains(c.toLowerCase()) ? "Добро пожаловать!" :
                                str.contains(d.toLowerCase()) ? "Добро пожаловать!" :
                                        "Здесь никого нет, Вы ошиблись дверью";
        System.out.println(f);

    }
}
