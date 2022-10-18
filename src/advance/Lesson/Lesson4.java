package advance.Lesson;

public class Lesson4 {
    public static void main(String[] args) {
//        {
//            int[] a = {1, 2, 3, 4, 5}; // переменная содержит референс (указатель) на место в памяти где хранятся данные
//            int[] b = a;
//            int[] c = {23, 2, 3, 4, 5};
//
//            a[0] = 23;
//
//            System.out.println("a: " + Arrays.toString(a));
//            System.out.println("a: " + Arrays.toString(a));
//            System.out.println("c: " + Arrays.toString(c));
//            System.out.println("a == b is " + (a == b)); // true
//            System.out.println("a == c is " + (a == c)); // false //Объекты сравнивать нельзя
//            System.out.println("a == c is " + Arrays.equals(a, c)); //true
//
//            a = null; //Ничего не находится, не занимает место в памяти (нал поинтер экспрешн)
//        }
//        {
//            System.out.println("Hello" + " worls");
//            System.out.println("\"");
//            System.out.println("Hello".concat("worls"));
//        }
//
//        {
//            String s1 = "Apple"; // строка imutable неизменяемая
//            String s2 = new String("Apple");
//            String s3 = "Apple";
//            String[] str = {s1, s2, s3};
//
//            System.out.println(s1 == s2); //true
//            System.out.println(s1 == "Apple"); //true
//            System.out.println(s1.equals("Apple"));
//            System.out.println(s1.equals(s3));
//        }
//        // charAt;
//        {
//            String str = "Hello Lord";
//            String str1 = "Hello Lena and Eric";
//
////            System.out.println(str.charAt(-1)); // index char
//            System.out.println(str.indexOf('l')); // найти символ в строке
//            System.out.println(str.indexOf('l', 2)); // найти символ в строке, с какой позиции искать
//            System.out.println(str.toLowerCase().indexOf('l', 3 + 1));
//            System.out.println((char) ('A' + 1));
//            System.out.println((char) (65 + 1));
//            System.out.println(str.lastIndexOf('l')); //найти первую с конца.
//            System.out.println(str1.contains(" Eric")); // найти в строке подстроку
//        }
//        // join;
//        {
//            String a = "a";
//            System.out.println(String.join("- -", "1", "2", "3", "4"));
//        }
        // split

    }
    {
        String a = "1 2 3 4 5 6";
//            String[] arr = a.split(" "); //преобразовать строку в массив по пробелу.
//            System.out.println("arr: " + Arrays.toString(arr));
        int[] arr = {1, 2, 5, 8, 0};
        System.out.println("arr: " + prePrintArray(arr));
    }
    static String prePrintArray(int[] arr){
            StringBuffer stringBuffer = new StringBuffer("[ ");
            for (int i = 0; i < arr.length; i++) {
                stringBuffer.append(arr[i]);
                if (i != arr.length - 1) {
                    stringBuffer.append(", ");
                }
            }
            stringBuffer.append("]");
            String result = stringBuffer.toString();
            return result;

    }
}
