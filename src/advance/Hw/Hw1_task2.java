package advance.Hw;

public class Hw1_task2 {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        int sum = a + b;
        int dif = a - b;
        int mult = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Sum = "  + sum + "\n" + "Difference = " + dif + "\n" + "Multiplication = " + mult + "\n"
                + "Division  = " + division + "\n" + "Remainder = " + remainder);

        if (a % b == 0) {
            System.out.println("Even a % b = " + remainder);
        } else {
            System.out.println("Odd a % b = " + remainder);
        }
        System.out.println("\uD83D\uDD25");

    }
}

