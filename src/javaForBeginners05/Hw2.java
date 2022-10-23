package Beginner.Hw;

public class Hw2 {

    public static void main(String[] args) {
        int number = 3;
        String task = "Task ";
        String line = "_____________________________";

        int x = 5;
        int y = 8;
        int z = 4;

        System.out.println(line + "\n" + task + (++number));
        System.out.print(x + "\n" + y + "\n" + z + "\n");
        System.out.print(x + ", " + y + ", " + z + "\n");

        System.out.println(line + "\n" + task + (++number));
        System.out.print("x = " + x + ", y = " + y + ", z = " + z  + "\n");

        System.out.println(line + "\n" + task + (++number));
        System.out.println("Sum of x and y = " + x + y);
        System.out.println("x * y = " + x * y);
        System.out.println("Разность переменных y и z = " + (y - z));

        int apple = 40;
        int student = 6;

        System.out.println(line + "\n" + task + (++number));
        System.out.println("Если " + apple + " яблок поделить на " + student  + " учеников, то каждый ученик получит по "
                + apple / student + " яблок(a), и " + apple % student + " яблок(а) останется учителю.");

        apple = 100;
        student = 21;
        System.out.println(line + "\n" + task + (++number));
        System.out.println("Если " + apple + " яблок поделить на " + student  + " учеников, то каждый ученик получит по "
                + apple / student + " яблок(a), и " + apple % student + " яблок(а) останется учителю.");

        int lemon = 6;
        int apples = 24 + lemon;
        int pears = apples - 12;

        System.out.println(line + "\n" + task + (++number));
        System.out.println("Fruit = " + (lemon + apples + pears));

        System.out.println(line + "\n" + task + (++number));
        System.out.println("Ответ = " + (40 - 8 - 5 - 7 - 2));

        System.out.println(line + "\n" + task + (++number));
        System.out.println(35 / 7);
        System.out.println(48 / 8);
        System.out.println(54 / 4);

        System.out.println(line + "\n" + task + (++number));
        System.out.println("Если 48 % 8 = 0 тогда кратно 8" + (48 % 8));
        System.out.println("Если число % 2 = 0 тогда четное" + (48 % 2) + " и " + (8 % 2));
        System.out.println("Если число % 2 = 1 тогда нечетное" + (47 % 2) + " и " + (49 % 2));
        System.out.println("Если число % 7 = 0 тогда кратно" + (47 % 7) + " и " + (49 % 7));


        int k = 5;
        int l = 6;
        int m = 8;

        System.out.println(line + "\n" + task + (++number));
        System.out.println("|     |+10|-5|*100|/2|%2|^2|++|--|");
        System.out.println("|k = " + k + "| " + (k + 10) + "| " + (k - 5) + " |" + (k * 100) + "|" + (k / 2) + " | " + (k % 2) + "|" + (k * k) + "|" + (++k) + " |" + (--k) + " |");
        System.out.println("|k = " + l + "| " + (l + 10) + "| " + (l - 5) + " |" + (l * 100) + "|" + (l / 2) + " | " + (l % 2) + "|" + (l * l) + "|" + (++l) + " |" + (--l) + " |");
        System.out.println("|k = " + m + "| " + (m + 10) + "| " + (m - 5) + " |" + (m * 100) + "|" + (m / 2) + " | " + (m % 2) + "|" + (m * m) + "|" + (++m) + " |" + (--m) + " |");


        x = 7;
        y = 18;
        int n = 3;

        int result1 = 7 * 7 * 7;
        int result2 = (5 * 7 + 7 * 18) / (8 * 7 + 10 * 18);
        int result3 = (3 * 7 - 18) / (7 + 18);

        System.out.println(line + "\n" + task + (++number));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

//        System.out.println((x * x * x) * (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))));
        
//        System.out.println(result1 * (result2 / result3));












    }
}
