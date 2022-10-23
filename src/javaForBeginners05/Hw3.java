package Beginner.Hw;

import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Float.valueOf;


public class Hw3 extends Hw2 {

    public static void main(String[] args) {

        int number = 2;
        String task = "Task ";
        String line = "_____________________________";

        /**
         2.	Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         */
        byte a = 34;
        byte b = 45;
        System.out.println(line + "\n" + task + (number++));
        System.out.println("a = " + a + ", b = " + b);
        /**
         * 3.	Создать переменные s и t типа short, присвоить им значения с разницей 60000.
         */
        short s = 30000;
        short t = -29999;
        System.out.println(line + "\n" + task + (number++));
        System.out.println("s = " + s + ", t = " + t);

        /**
         * 4.	Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
         */
        int i = Integer.MIN_VALUE; //Разобраться.
        i = Integer.MAX_VALUE;


        String line1 = "___________________________";
        String line2 = "_______________________________________";
        String pipe = "| \t";

        System.out.println(line + "\n" + task + (number++));
        System.out.println(
                line1 + "\n" + pipe
                        + "int min" + pipe + i + pipe + "\n"
                        + line1 + "\n" + pipe
                        + "int max" + pipe + i + pipe + "\n" + line1
        );

        /**
         * 5.	Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         * (можно ненастоящий номер телефона, например, 18009998877)
         */
        long phoneNumber = 18009998877L;
        System.out.println(line + "\n" + task + (number++));
        System.out.println(phoneNumber);

        /**
         * 6.	Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d
         * типа double и присвоить ей значение 100.101101.
         */
        float f = 100.101101f;
        double d = 100.101101;

        System.out.println(line + "\n" + task + (number++));
        System.out.println(
                line2 + "\n" + pipe
                        + "float f = 100.101101" + pipe + f + pipe + "\n"
                        + line2 + "\n" + pipe
                        + "double d = 100.101101" + pipe + d + pipe + "\n" + line2
        );

        /**
         * 7  a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         * b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         */
        Double dd = sum(10.09999, 20.099999);
        Float ff = sum(10.09999F, 20.099999F);

        System.out.println(line + "\n" + task + (number++));
        System.out.println(dd);
        System.out.println(ff);

/**
 * 8.	Создать переменную float ff и присвоить ей значение выражения 10 / 3.
 * Создать переменную double dd и присвоить ей значение выражения 10 / 3.
 */
        number++;


        float fff = 10 / 3F;
        double ddd = 10 / 3F;

        /**
         * 9.	Создать переменные типа Float:
         */
        number++;

        Float floatSum = sum(f, fff);
        Float floatSub = (f - fff);
        Float floatProduct = (f * fff);
        Float floatQuotient = (f / fff);
        Float floatRemainder = (f % fff);

        /**
         * Создать переменные типа double:
         */
        number++;

        double doubleSum = sum(d, ddd);
        double doubleSub = (d - ddd);
        double doubleProduct = (d * ddd);
        double doubleQuotient = (d / ddd);
        double doubleRemainder = (d % ddd);


        /**
         * Распечатать результаты вычислений заданий 8 - 10 в виде таблицы:
         */

        System.out.println(line + "\n" + task + (number++));
        System.out.println(line2 + "\n" + pipe
                + "float ff" + "\t" + pipe + fff + "\t" + "\t" + pipe + "\t" + "\n" + line2 + "\n" + pipe
                + "double dd" + "\t" + pipe + ddd + pipe + "\n" + line2 + "\n" + pipe
                + "floatProduct" + pipe + floatProduct + "\t" + "\t" + pipe + "\n" + line2 + "\n" + pipe
                + "floatQuotient" + pipe + floatQuotient + "\t" + "\t" + pipe + "\n" + line2 + "\n" + pipe
                + "floatRemainder" + pipe + floatRemainder + "\t" + pipe + "\n" + line2 + "\n" + pipe
                + "doubleSum" + "\t" + pipe + doubleSum + pipe + "\n" + line2 + "\n" + pipe
                + "doubleProduct" + pipe + doubleProduct + pipe + "\n" + line2 + "\n" + pipe
                + "doubleQuotient" + pipe + doubleQuotient + pipe + "\n" + line2 + "\n" + pipe
                + "doubleRemainder" + pipe + doubleRemainder + pipe + "\n" + line2 + "\n"
        );

        /**
         * Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         */

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = -505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = -1000000.001;
        short t9 = 1010;

        number++;
        number++;

        /**
         * С помощью полей классов ссылочного типа распечатать таблицу:
         */

        String line3 = "_________________________________________________________________________";
        String tab = "\t";
        String pipe1 = "|";

        System.out.println(line + "\n" + task + (number++));
        System.out.println(line3 + "\n"
                + pipe1 + "Type" + tab + pipe1 + "Size in bits" + tab + pipe1 + "min" + tab + tab + tab + tab + tab + pipe1 + "max" + tab + tab + tab + tab + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "byte" + tab + pipe1 + "8 bit" + tab + tab + tab + pipe1 + Byte.MIN_VALUE + tab + tab + tab + tab + tab + pipe1 + Byte.MAX_VALUE + tab + tab + tab + tab + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "short" + tab + pipe1 + "16 bit" + tab + tab + tab + pipe1 + Short.MIN_VALUE + tab + tab + tab + tab + tab + pipe1 + Short.MAX_VALUE + tab + tab + tab + tab + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "int" + tab + pipe1 + "32 bit" + tab + tab + tab + pipe1 + Integer.MIN_VALUE + tab + tab + tab + pipe1 + Integer.MAX_VALUE + tab + tab + tab + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "long" + tab + pipe1 + "64 bit" + tab + tab + tab + pipe1 + Long.MIN_VALUE + tab + pipe1 + Long.MAX_VALUE + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "float" + tab + pipe1 + "32 bit" + tab + tab + tab + pipe1 + Float.MIN_VALUE + tab + tab + tab + tab + pipe1 + Float.MAX_VALUE + tab + tab + tab + pipe1 + "\n" + line3 + "\n"
                + pipe1 + "double" + tab + pipe1 + "64 bit" + tab + tab + tab + pipe1 + Double.MIN_VALUE + tab + tab + tab + tab + pipe1 + Double.MAX_VALUE + tab + pipe1 + "\n" + line3 + "\n"

        );

        /**
         * Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить 2
         * переменные друг с другом с помощью метода .equals(). Вывести результат сравнения на печать в виде выражения:
         * “Если num1 равно  num2, то результат сравнения методом .equals() = …”
         *
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */

        Integer num1 = 20000;
        Integer num2 = 20001;
        System.out.println(line + "\n" + task + (number++));
        if (num1.equals(num2)) {
            System.out.println("Если num1 равно num2, то результат сравнения методом .equals() true = " + num1.equals(num2));
        } else {
            System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() false = " + num1.equals(num2));
        }

        /**
         * Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */

        System.out.println(line + "\n" + task + (number++));
        int number1 = 786;
        int number2 = 786;
        System.out.println("Если number1 = number2, то результат сравнения методом = " + Integer.compare(number1, number2));

        number1 = 786;
        number2 = 789;
        System.out.println("Если number1 < number2, то результат сравнения методом =" + Integer.compare(number1, number2));

        number1 = 786;
        number2 = -789;
        System.out.println("Если number1 > number2, то результат сравнения методом = " + Integer.compare(number1, number2));


        /**
         * Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int
         */

        Float num4 = 234.9999F;
        System.out.println(line + "\n" + task + (number++));
        System.out.println(num4.intValue());

        /**
         * С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */

        Double num5D = 34.56;
        Double num6D = 134.56;
        System.out.println(line + "\n" + task + (number++));
        System.out.println(sum(num5D, num6D));

        /**
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */

        Float num5F = 234.56F;
        Float num6F = 4134.56F;
        System.out.println(line + "\n" + task + (number++));
        System.out.println(Integer.sum(num5F.intValue(), num6F.intValue()));

        /**
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println(line + "\n" + task + (number++));
        System.out.println((String.valueOf(short1 - short2)));
        short1 = 12500;
        short2 = 12300;
        System.out.println((String.valueOf(short1 - short2).getClass()));
        System.out.println((String.valueOf(short1 - short2)));
        System.out.println("12000 - 12300 = " + short1.compareTo(short2));
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        /**
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         *
         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         *
         * Сравнить полученные результаты doub1 - doub2 и str1 - str2
         */

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        Double result = doub1 - doub2;
        Double result2 = Double.parseDouble(str1) - Double.valueOf(str2);

        System.out.println(line + "\n" + task + (number++));
        System.out.println(result);
        System.out.println(result2);
        System.out.println((result.equals(result2)));
        System.out.println((Double.compare(result, result2)));

        /**
         * Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
         * (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
         * затем минимальное значение. Посчитать и распечатать среднее значение. Распечатать результат
         * среднего значения температуры тела кота.
         */

        Float temp;

    }
}
