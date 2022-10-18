package advance.Hw.Hw5;

import java.util.Arrays;

/**
 * Extra Задача №1
 * Написать программу что выводит на печать круг картинкой. Любыми символами. Круг может быть овальный, пустой внутри или наполненный символами.
 * При написании программы можно использовать любые доступные знания.
 *
 * Extra Задача №2
 * Создать массив строк из любой строчки песни/текста (длина массива не менее 5 элементов). Любыми доступными знаниями выстроить элементы массива в алфавитном порядке. Вывести на печать
 *
 * Extra Задача №3
 * Создать массив строк из любой строчки песни/текста (длина массива не менее 10 элементов). Любыми доступными знаниями подсчитать и вывести
 * на печать каждую букву что встречается в массиве. (Пример а = 5, b = 4, если = 0 можно не выводить на печать).
 */

public class Extra2 {


    public static void sortArr (String[]arr){
        String temp = "";
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].toLowerCase();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j].charAt(0) > arr[j+1].charAt(0)) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }




    public static void main(String[] args) {


        String[] arrSong = new String[]{"Разбежавшись", "прыгну", "со", "скалы", "вот", "я", "был"};

        sortArr(arrSong);


    }
}