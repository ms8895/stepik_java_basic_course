import java.util.Scanner;

public class ForDegree {
    public static void main(String[] args) {
        /*На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
Примечание. Каждая строка вывода оканчивается числом, а не пробелом.*/

        Scanner sc = new Scanner(System.in);
        //Для подсчета введенных чисел
        int countNumder = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 2; i <= 5; i++) {
                //Возводит в степень и преобразует в int
                int x = (int) Math.pow(n, i);

                System.out.print(x);

                //Если 5 степень, то в пробел после числа не ставит
                if (i != 5) {
                    System.out.print(" ");
                }
            }
            System.out.println();

//Считает количество введенных чисел
            countNumder++;
            if (countNumder == 3) {
                break;
            }
        }
        sc.close();
    }
}
