package advance.Hw.Hw5;

import java.util.Arrays;

/**
 *  * Extra Задача №3
 *  * Создать массив строк из любой строчки песни/текста (длина массива не менее 10 элементов). Любыми доступными знаниями подсчитать и вывести
 *  * на печать каждую букву что встречается в массиве. (Пример а = 5, b = 4, если = 0 можно не выводить на печать).
 */

public class Extra3 {

    public static void countChar(String[] arr) {
        int count = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    count++;
                }
            }
            Character[] arrChar = new Character[count];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    --count;
                    arrChar[count] = arr[i].charAt(j);
                }
            }

            System.out.println(Arrays.toString(arrChar));


            for (int i = 'a'; i <= 'z'; i++) {
                int countRepeat = 0;
                for (int j = 0; j < arrChar.length; j++) {
                    if (arrChar[j] == i) {
                        countRepeat++;
                    }
                }
                    if (countRepeat != 0) {
                        System.out.println((char)i + " = " + countRepeat );
                }

            }

        }
    }

    public static void main(String[] args) {

        String[] arrSong = new String[] {"this", "is", "how", "the", "world", "you", "gotta", "leave", "before", "you", "get"};

        countChar(arrSong);
    }
}
