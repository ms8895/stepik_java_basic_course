public class TypeBoolean {
    public static void main(String[] args) {

        //Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
        //        Во всех остальных случаях метод должен возвращать false.

       /* boolean ffff = booleanExpression(false, false, false, false);+
        boolean ffft = booleanExpression(false, false, false, true);+
        boolean fftf = booleanExpression(false, false, true, false);+
        boolean fftt = booleanExpression(false, false, true, true);+
        boolean ftff = booleanExpression(false, true, false, false);+
        boolean ftft = booleanExpression(false, true, false, true);+
        boolean fttf = booleanExpression(false, true, true, false);+
        boolean fttt = booleanExpression(false, true, true, true);+
        boolean tfff = booleanExpression(true, false, false, false);+
        boolean tfft = booleanExpression(true, false, false, true);+
        boolean tftf = booleanExpression(true, false, true, false);+
        boolean tftt = booleanExpression(true, false, true, true);+
        boolean ttff = booleanExpression(true, true, false, false);+
        boolean ttft = booleanExpression(true, true, false, true);+
        boolean tttf = booleanExpression(true, true, true, false);
        boolean tttt = booleanExpression(true, true, true, true);*/


        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        System.out.println(booleanExpression(a, b, c, d));
        System.out.println(booleanExpression_three(a, b, c, d));

        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z+= --x + y++;
        System.out.println(x + y + z);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;

        if (a) {
            count++;
        }
        if (b) {
            count++;
        }
        if (c) {
            count++;
        }
        if (d) {
            count++;
        }
        return count == 2;
    }


    public static boolean booleanExpression_three(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) ^ (c && d) || (a && c) ^ (b && d) || (a && d) ^ (b && c);
    }
}