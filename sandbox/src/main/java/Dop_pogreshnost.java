public class Dop_pogreshnost {
//Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//Допустимая погрешность – 0.0001 (1E-4)
    public static boolean doubleExpression(double a, double b, double c) {
        if (Math.abs((a + b) - c) < 1E-4) {
            return true;
        }

        return false;
    }
}
