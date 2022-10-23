package Advance.Lesson;

import java.util.Scanner;

public class Lesson3ArrayWhile {
    public static void main(String[] args) {


        int i = 0;
        while (i < 10) {
            System.out.println(i + "");
            i++;
        }


        //do while
        {
            System.out.println("\n");
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int number = 1;
            while (number != 0) {
                System.out.println("Enter a number, to stop enter 0: ");
                number = input.nextInt();
                sum += number;
                System.out.println("sum so far is " + sum);
            }
        }




    }
}
