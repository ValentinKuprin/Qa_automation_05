package advance.Hw;

public class Hw3 {
    public static void main(String[] args) {

        /**
         * Задача №1
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести сумму всех значений массива.
         */

        int sum = 0;
        int[] array = {9, 2, 16, 4, 5, 12, 7, 8, 6};

//        for (int x : array) {
//            sum += x;
//            System.out.println(sum);
//        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Task # 1 " + sum);

        /**
         * Задача №2
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести максимальное значение массива.
         */

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Task # 2 " + max);

        /**
         * Задача №3
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести минимальное значение массива.
         */

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Task # 3 " + min);

        /**
         * Задача №4
         *
         * Дан массив:
         * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         * необходимо вывести среднее арифметическое всех значений массива.
         */

        sum = 0;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            sum += array1[i];
        }
        double arg = sum / array1.length;
        System.out.println("Task # 4 " + arg);

        /**
         * Задача №5
         *
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести сумму элементов массива.
         */

        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        sum = 0;
//        for (int[] num : array3) {
//            for (int i : num) {
//                sum += i;
//                System.out.println(sum);
//            }
//        }
//        System.out.println("Task # 5 " + sum);
//
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sum+= array3[i][j];
            }
        }
        System.out.println("Task # 5 " + sum);

        /**
         * Задача №6
         *
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести максимальное значение массива.
         */

        int maxTask4 = Integer.MIN_VALUE;
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (array4[i][j] > maxTask4) {
                    maxTask4 = array4[i][j];
                }
            }
        }
        System.out.println("Task # 6 " + maxTask4);

        /**
         * Задача №7
         *
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести количество элементов в массиве.
         */

        int count = 0;

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                count++;
            }
        }
        System.out.println("Task # 7 " + count);









    }
}
