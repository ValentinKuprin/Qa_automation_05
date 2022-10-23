package Advance.Hw;

public class Hw3For {

    public static void main(String[] args) {

        int a = 34;
        int b = 44;

        System.out.println("_____________________________ \n" + "Task 1");
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

        System.out.println("_____________________________ \n" + "Task 2");
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        System.out.println("_____________________________ \n" + "Task 3");
        if (a > 10) {
            System.out.println("больше 10");
            if (a < 100) {
                System.out.println("меньше 100");
                if ((a / 2) > 20) {
                    System.out.println(a / 20);
                }
            }
        }
        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        System.out.println("_____________________________ \n" + "Task 4");
        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
        }


        System.out.println("_____________________________ \n" + "Task 5");
        for (int i = 1; i < 10000; i*= 5) {
            System.out.println(i);
        }

        System.out.println("_____________________________ \n" + "Task 6");
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0)
            System.out.println(i);
        }

        System.out.println("_____________________________ \n" + "Task 6.1");
        for (int i = 40; i < 61; i+=4) {
            System.out.println(i);
        }
    }
}
