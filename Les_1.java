package Lesson_1;

public class Main {

    public static void main(String[] args) {

        byte byteMin = 1;
        short shortMid = 20;
        int intBig = 500;
        long longMax = 600L;

        float floatMin = 5.4f;
        double doubleMax = 6.8;

        char charWord = 5065;

        boolean trueBoolean = true;

        String string = byteMin + shortMid + "Hello";
        System.out.println(byteMin + shortMid + intBig + longMax + floatMin);
        System.out.println(doubleMax + charWord + string);

        System.out.println(resultFirst(2, 3, 4, 5));

        System.out.println(resultDouble(5, 15));

        System.out.println(resultTird(-5));

        System.out.println(result4(-12));

        System.out.println(result5("Михаил"));

        System.out.println(resultYear(1900));

    }

    public static double resultFirst(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean resultDouble(int a, int b) {

        if ((a + b) >= 10 || (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String resultTird(int a) {
        if (a >= 0) {
            return "Число положительное";
        }
        return "Число отрицательное";
    }

    public static boolean result4(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static String result5(String a) {
        return "Привет " + a + "!";
    }

    public static String resultYear(int year) {

        if (year % 400 == 0) {
            return "Год високосный";
        } else if (year % 100 == 0) {
            return "Год не високосный";
        } else if (year % 4 == 0) {
            return "Год високосный";
        } else return "Год не високосный";
    }

}
