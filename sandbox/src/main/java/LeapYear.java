public class LeapYear {

    //В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100,
    // либо кратен 400.

    // Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
    // до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже,
    // но здесь для упрощения мы распространяем его действие на всю нашу эру.

    public static int leapYearCount(int year) {
        int count = 0;
        for (int x = 1; x <= year; x++)
            if ((x % 4 == 0) && (x % 100 != 0) || x % 400 == 0) {
                count++;
            }
        return count;
    }

}
