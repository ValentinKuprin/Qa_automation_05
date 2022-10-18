package javaForBeginners05;

import java.util.Arrays;

public class Hw7 {

    static void printLineTask(String numTask) {
        System.out.println("******************** Задача № " + numTask + " ********************");
    }

    /** Task 2 */
    public static void task2(int start, int end, int step) {
        if (start < end) {
            for (int i = start; i <= end; i += step) {
                if (start % step == 0 && end % step == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        if (end < start) {
            for (int i = start; i >= end; i -= step) {
                if (start % step == 0 && end % step == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        if (start == end && start % end == 0) {
            System.out.println(start);
        }
    }

    /** Task 21*/

    public static void arr (int num, int l) {
        int[] array = new int[l];
        for (int i = 0; i < l ;) {
            int number = ((int) (Math.random() * num)) + 1;
            if (number % 2 == 0) {
                array[i] = number;
                i++;
            }
        }
        System.out.print(Arrays.toString(array) + "\n");
    }

    /** Task 22*/
    public static void arrAvg (int[] num) {
        double avg = 0;
        if (num.length != 0) {
            for (int i = 0; i < num.length; i++) {
                avg += num[i];
            }
            avg = avg / num.length;
        }
        System.out.println(avg);
    }

    /** Task 23*/

    public static void arrOddNumbers () {
        int arrLong = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                arrLong++;
            }
        }
        int[] arrOddNumbers = new int[arrLong];
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                --arrLong;
                arrOddNumbers[arrLong] += i;
            }
        }
        System.out.println(Arrays.toString(arrOddNumbers));
    }

    /** Task 24*/

    public static void randomEvenNumbers() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length;i++) {
            arr[i] = (int) ((Math.random() * 101 ) + 100);
        }
        System.out.println(Arrays.toString(arr));
    }

    /** Task 25*/

    public static void checkArray(int[] arr, int num) {
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println("Yes");
                    break;
                } else if (arr[i] == arr[i] + 1 || arr[i] == arr[i] - 1) {
                    System.out.println("No");
                }
            }
        }
    }










    public static void main(String[] args) {

        /** 2 Написать универсальный метод для построения последовательности, которая начинается с числа start, заканчивается
         * числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу step. Этот метод должен
         * высчитывать первое кратное число в диапазоне [start, end] и строить последовательность (возрастающую или убывающую)
         * от вычисленного первого кратного числа с шагом step.
         (Эта задача по мотивам разбора HW6,  Part 1  в воскресенье 9 октября)  */

        printLineTask("2");

        task2(3,15, 3);
        task2(15,3, 3);
        task2(3,3, 0);
        task2(3,3, 4);

        /** 21 Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
         * Заполняем значения и печатаем с помощью цикла for. Длина массива - l.  */

        printLineTask("21");

        arr(6, 6);


        /** 22 Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
         * Заполняем значения и печатаем с помощью цикла for. Длина массива - l.  */

        printLineTask("22");

        arrAvg(new int[] {3, 4, 5, 6, 7, 8, 9, 0});

        /** 23 Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).  */

        printLineTask("23");

        arrOddNumbers();

        /** 24 Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200. */

        printLineTask("24");

        randomEvenNumbers();

        /** 25 Написать метод, который принимает на вход массив int[] array и число int number. Метод проверяет, содержится ли число number
         * в массиве array. При первом нахождении числа number, метод печатает “yes”. При каждом нахождении чисел на 1 больше числа number,
         * или на 1 меньше числа number, метод печатает “maybe”. Метод печатает “no”, если не находит ни одного числа, соответствующего условиям  */

        printLineTask("25");












    }

}
