package javaForBeginners05;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Hw6 {

    static int num = 1;

    static void printLineTask(String numTask) {
        System.out.println("******************** Задача № " + numTask + " ********************");
    }

    /**
     * 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
     * чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
     */

    public static void sequenceOfDecimal(double start, double end, double step) {
        if (start < end) {
            for (double i = start; i <= end; i = i += step) {
                System.out.println(i);
            }
        }
        for (double i = start; i >= end; i -= step) {
            System.out.println(i);
        }
    }

    /**
     * 11 Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать
     * последовательность букв английского алфавита в промежутке между значениями n и m включительно.
     */

    public static void outputChar(char n, char m) {
        String str = "";
        if (((int) n >= 65 && (int) n <= 90 || (int) n >= 97 && (int) n <= 122) && ((int) m >= 65 && (int) m <= 90) || (int) m >= 97 && (int) m <= 122) {
            if ((int) n < (int) m) {
                for (char i = n; i <= m; i++) {
                    if ((int) i <= 90 || (int) i >= 97) {
                        str += Character.toString(i);
                    }
                }
            } else {
                for (char i = n; i >= m; i--) {
                    if ((int) i <= 90 || (int) i >= 97) {
                        str += Character.toString(i);
                    }
                }
            }
            System.out.println(str);
        } else {
            System.out.println("не верные данные");
        }
    }

    /**
     * 12 Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля. Длина последовательности = .
     */

    public static void printEvenNumbers(int num) {
        String strNum = "";
        for (int i = 0; i <= num; i += 2) {
            strNum += (i) + " ";
        }
        System.out.println(strNum);
    }

    /**
     * 13 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
     */

    public static void powNum(int num) {

        int powResult = 1;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                powResult = powResult * 2;
                System.out.println(powResult);
            }
        } else {
            System.out.println("Степень меньше 1");
        }
    }

    /**
     * 14 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
     */

    public static void numbers() {
        String str = "";
        for (int i = 0; i <= 9; i++) {
            str += i;
        }
        for (int i = 0; i <= 9; i++) {
            str += i + "" + "" + i;
        }
        for (int i = 0; i <= 9; i++) {
            str += i + "" + "" + i + "" + i;
        }
        for (int i = 0; i <= 9; i++) {
            str += i + "" + "" + i + "" + i + "" + i;
        }
        System.out.println(str);
    }

    /**
     * 15 Написать метод, который генерирует  последовательность чисел:
     * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
     */

    public static void gen1(int num) {
        String str = "";
        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                str = i + ", ";
            } else if (num > 0) {
                str += i + ", " + (-i) + ", ";
            }
        }
        System.out.println(str.substring(0, str.length()-2));
    }


    /** 16 Распечатать последовательность чисел:
     0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25 */

    public static void gen2(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /** 17
     * Написать метод, который принимает параметры n, m, , и печатает последовательность нечетных чисел начиная с числа n, с шагом m,  длина последовательности   */



    /** 18
     * Написать метод, который принимает на вход параметры n, m, l и генерирует последовательность случайных целых чисел
     * в промежутке от n до m  включительно. Длина последовательности - l. Вывести результат на печать   */

    public static void getParam(int n  , int m , int l) {
        for (int i = 0; i < l; i++) {
            int num = n + (int)(Math.random()*((m - n) + 1));
            System.out.print(num + ", ");
        }

    }

    /** 21
     * Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой цифрой (десятки)
     * и второй цифрой (единицы) не превышает 3.*/

    public static void twoDigits () {
        for (int i = 11; i <= 99; i++) {
            if ((Math.abs((int) (i /10) - (i % 10))) <= 3) {
//                System.out.println(i / 10);
                System.out.print(i + " ");
            }
        }
    }







    public static void main(String[] args) {

        printLineTask("1");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        printLineTask("2");

        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        printLineTask("3");

        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /**4 Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         *
         */

        printLineTask("4");

        for (int i = 326; i > 300; i -= 1) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        /** 5 Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         *
         */

        printLineTask("5");

        for (double i = 12.1; i < 12.99; i += 0.1) {
            System.out.print(Math.ceil(i * 10) / 10 + " ");
        }
        System.out.println("\n");


        /** 6 Распечатать последовательность четных чисел от 215 до 237 включительно
         *
         */

        printLineTask("6");

        for (int i = 216; i < 238; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        /** 7 Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно. */

        printLineTask("7");

        for (int i = 8; i < 14; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /** 8 Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
         *  максимальным значением short. Числа в последовательности должны быть кратны 15001.
         */

        printLineTask("8");

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");

        /** 9 Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть
         * распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO. */

        printLineTask("9");

        for (short i = -10; i < 35; i++) {
            if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + " " + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + " " + "\u001B[0m");
            } else if (i == 0) {
                System.out.print("ZERO");
            }
        }
        System.out.println("\n");


        /** 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
         * чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end. */

        printLineTask("10");

        sequenceOfDecimal(10.0, 15.0, 0.5);
        sequenceOfDecimal(10.0, 0.0, 0.5);

        printLineTask("11");
        /** 11 Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать
         * последовательность букв английского алфавита в промежутке между значениями n и m включительно.  */

        outputChar('a', 'f');
        outputChar('A', 'F');
        outputChar('F', 'a');
        outputChar('a', 'F');
        outputChar('1', 'F');
        outputChar('D', '2');

        printLineTask("12");
        /** 12 Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля. Длина последовательности = . */

        printEvenNumbers(10);

        printLineTask("13");
        /** 13 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно */

        powNum(6);
        powNum(0);

        printLineTask("14");
        /** 14 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно. */
        numbers();

        printLineTask("15");
        /** 15 Написать метод, который генерирует  последовательность чисел:
         0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5  */
        gen1(5);

        printLineTask("16");
        /** 16 Распечатать последовательность чисел:
         0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25 */

        gen2(26);

        printLineTask("18");
        getParam(10, 1, 3);

       printLineTask("21");
        /** 21 Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой
         * цифрой (десятки) и второй цифрой (единицы) не превышает 3. */

        twoDigits();


    }
}
