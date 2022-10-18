package javaForBeginners05;

public class Hw5 {

    static int num = 2;

    static void printLineTask() {
//        System.out.println("_______________________\n" + "Task #" + num++);
        System.out.println("******************** Задача № " + num++ + " ********************");
    }

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }


    /**
     * 2
     * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод
     */

    public static String dayOfWeek(int dayNumber) {
        if (dayNumber == 1) {
            return "Понедельник";
        }
        if (dayNumber == 2) {
            return "Вторник";
        }
        if (dayNumber == 3) {
            return "Среда";
        }
        if (dayNumber == 4) {
            return "Четверг";
        }
        if (dayNumber == 5) {
            return "Пятница";
        }
        if (dayNumber == 6) {
            return "Суббота";
        }
        if (dayNumber == 7) {
            return "Воскресение";
        }

        return "Нет такого дня недели";
    }


    /**
     * 3
     * Написать алгоритм вычисления среднего возраста в семье из 3х человек. Протестируйте алгоритм на позитивные и негативные сценарии.
     */

    public static Double averageAge(int father, int mother, int child) {
        double avg = 0.0;
        if (father >= 0 || mother >= 0 || child >= 0) {
            avg = (father + mother + child) / 3;
            return avg;
        } else {
            return Double.MIN_VALUE;
        }

    }

    /**
     * 4
     * Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
     * k и l
     * k, l, m
     * k, l, m, n
     * Написать тесты на каждый метод.
     */

    public static double minValue(int k, int l) {
        if (k < l) {
            return k;
        }
        return l;
    }


    public static int minValue(int k, int l, int m) {
        int min = Integer.MAX_VALUE;
        if (min > k) {
            min = k;
        }
        if (min > l) {
            min = l;
        }
        if (min > m) {
            min = m;
        }

        return min;
    }


    public static double minValue(int k, int l, int m, int n) {

        return (Math.min(k, Math.min(l, Math.min(m, n))));
    }

    /**
     * 5
     * Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает и возвращает значения типа double.
     * Например,
     * t1 = 39
     * t2 = 39
     * t3 = 39
     * t4 = 39
     * t5 = 39
     * TempAverage = 39
     */

    public static double avgTemCat(double t1, double t2, double t3, double t4, double t5) {
        double tempAverage = 0;
        if (t1 >= 25.0 && t1 <= 45.0 && t2 >= 25.0 && t2 <= 45.0 && t3 >= 25.0 && t3 <= 45.0 && t4 >= 25.0 && t4 <= 45.0 && t5 >= 25.0 && t5 <= 45.0) {

            tempAverage = (t1 + t2 + t3 + t4 + t5) / 5;

            return tempAverage;

        } else {

            return -1.0;
        }
    }

    /**
     * 6
     * Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
     * При невалидных значениях метод возвращает -1.
     */

    public static int salaryOfMonth(int countTime, double hourOfWork, int days) {
        double salary = 0;
        if (countTime < 24 && countTime > 0 || days > 0 && days < 31 || hourOfWork > 0) {
            salary = countTime * hourOfWork * days;

            return (int) salary;
        }

        return -1;
    }

    /**
     * 7
     * Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
     * Например,
     * price for 1 = 25 руб 50 коп (25.5)
     * amount = 5
     * expected total = 127 руб 50 коп (127.5)
     * <p>
     * При невалидных значениях метод возвращает -1
     */


    public static double sumOfPurchases(double price, int amount) {
        double sumOfPurchases = price * amount;

        return sumOfPurchases;
    }

    /**
     * 8 Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи зарплаты сотрудникам.
     * Например:
     * <p>
     * “Смирнова Мария Ивановна 		70000 руб 00 коп”
     * <p>
     * если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
     * Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости тоже должна быть распечатана пустая строка ""
     */

    public static String listOfSalary(int time, double hourOfWork, int days, String fio) {
        double salary = 0;
        int rubles = 0;
        int kop = 0;
        if (time < 24 && time > 0 || days > 0 && days < 31 || hourOfWork > 0) {
            salary = time * hourOfWork * days;
            rubles = (int) (salary - (salary % 1));
            kop = (int) Math.floor(salary % 1 * 100);
//            return rubles + " rub " + kop + " коп " + fio;
//        } else if (fio.equals("") || fio.equals(null)) {
//            return rubles + " rub " + kop + " коп " + "";
////        } else {
//
//        }
//
//
//        }return rubles + " rub " + kop + " коп " + fio;

        }
        return fio + "    " + rubles + " rub " + kop + " коп ";
    }

    /** 9 Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
     Смирнова Мария Ивановна 		70000 руб 00 коп
     Серебров Иван Петрович 		128059 руб 00 коп */


    /**
     * 10 Записать в виде метода и протестировать:
     * дано int x
     */

    public static String testMethod(int x) {
        if (x < 0) {
            return "x is negative";
        } else if (x > 0) {
            return "x is positive";
        } else {

            return "x is zero";
        }
    }

    /**
     * 11 Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
     */

    public static String priceFormat(double price) {
        int rub = (int) Math.floor(price);
        int kop = (int) ((price - rub) * 100);
        return rub + " руб " + kop + " коп";
    }

    /**
     * 12 Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.
     */

    public static String weight(double weight) {
        int kg = (int) Math.floor(weight);
        int gr = (int) ((weight - kg) * 1000);
        return kg + " кг " + gr + " гр";
    }

    /**
     * 13 Написать метод, который принимает на вход необходимые параметры, и печатает чек. Этот метод тестировать
     * не нужно, но необходимо использовать все раннее написанные методы (в задачах из Part 1 тоже могут пригодиться некоторые методы)
     */

    public static String checkOfBread(double price, int amount, String name) {
        String priceOfCount = "Цена за 1шт ";
        String countOfGoods = "Количество товара ";
        String count = " шт";
        String sumOfPayment = "Сумма к оплате ";
        String line = "________________________________";
        String space = "   ";
        priceFormat(sumOfPurchases(price, amount));
        priceFormat(price);

        return name + "\n" + priceOfCount + space + space + priceFormat(price) + "\n" + countOfGoods + space
                + space + space + amount + count + "\n" + line + "\n" + sumOfPayment
                + space + priceFormat(sumOfPurchases(price, amount));
    }

    /**
     * 14 Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
     * число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
     * Например:
     * год рождения 1999
     * 1 + 9 + 9 + 9 = 28
     * 2 + 8 = 10
     * 1 + 0 = 1
     * Счастливое число - 1
     */

    public static int luckyNumber(int year) {
        int result = (year % 10 + year / 10 % 10 + year / 100 % 10 + year / 1000 % 10);
        if (result < 10) {
            return result;
        } else {
            result = (result % 10 + result / 10 % 10);
            if (result < 10) {
                return result;
            } else {
                result = (result % 10 + result / 10 % 10);
                if (result < 10) {
                    return result;
                } else {
                    result = (result % 10 + result / 10 % 10);
                }
            }
        }
        return result;
    }

    /**
     * 15 а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
     * Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
     * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
     * <p>
     * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
     */


    public static String differenceBetweenAvgMediana(int a, int b, int c) {
        int maxValue = (Math.max(a, Math.max(b, c)));
        int mediana = a + b + c - (minValue(a, b, c) + maxValue);
        int avg = (a + b + c) / 3;
        double difference = avg - mediana;
        if (difference > 2) {

            return "Среднее значение " + avg + " отличается от медианы " + mediana + " на " + difference;
        } else {

            return "Среднее значение = " + avg + " медиана = " + mediana;
        }
    }

    /** 16 Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
     *  и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”. */




    public static void main(String[] args) {

        printLineTask();
        /**
         * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод
         */
        String day = "Среда";

        verifyEquals(day, dayOfWeek(3));


        printLineTask();
        /**
         * Написать алгоритм вычисления среднего возраста в семье из 3х человек. Протестируйте алгоритм на позитивные и негативные сценарии.
         */

        double avgAge = 20.0;

        verifyEquals(21.0, averageAge(30, 20, 10));

        printLineTask();

        verifyEquals(3, minValue(7, 3));
        verifyEquals(-7, minValue(0, 15, -7));
        verifyEquals(-99, minValue(23564, 0, 7456, -99));


        verifyEquals(3, minValue(7, 2));
        verifyEquals(-7, minValue(0, 15, -8));
        verifyEquals(-99, minValue(23564, 0, 7456, 999));


        printLineTask();
        /** 5 Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает и возвращает значения типа double. */

        double temp1 = 39.00;

        verifyEquals(temp1, avgTemCat(39.4, 38.2, 39.1, 39.4, 38.9)); // pass

        verifyEquals(39.02, avgTemCat(39.5, 38.2, 39.1, 39.4, 38.9)); // false

        verifyEquals(-1, avgTemCat(45.8, 38.2, 37.9, 39.4, 38.9));

        verifyEquals(-1, avgTemCat(39.8, 38.2, 24.9, 39.4, 38.9));

        printLineTask();
        /** 6 Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
         При невалидных значениях метод возвращает -1.  */
        int salaryTask6 = 124000;
        verifyEquals(124000, salaryOfMonth(8, 500.00, 31));

        verifyEquals(-1, salaryOfMonth(8, 500.00, 32));

        printLineTask();
        /** 7
         * Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
         * Например,
         * price for 1 = 25 руб 50 коп (25.5)
         * amount = 5
         * expected total = 127 руб 50 коп (127.5)
         *
         * При невалидных значениях метод возвращает -1
         */

        verifyEquals(127.50, sumOfPurchases(25.50, 5));

        printLineTask();
        /** 8 Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи зарплаты сотрудникам.
         Например:

         “Смирнова Мария Ивановна 		70000 руб 00 коп”

         если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
         Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости тоже должна быть распечатана пустая строка "" */


        System.out.println(listOfSalary(8, 500.33, 31, "Сафонова Татьяна Игоревна"));

        printLineTask();
        /** 9 Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
         Смирнова Мария Ивановна 		70000 руб 00 коп
         Серебров Иван Петрович 		128059 руб 00 коп */


        printLineTask();
        /** 10 Записать в виде метода и протестировать:
         дано int x  */
        String negative = "x is negative";
        String positive = "x is positive";
        String zero = "x is zero";

        verifyEquals(negative, testMethod(-1));
        verifyEquals(positive, testMethod(1));
        verifyEquals(zero, testMethod(0));


        /** 11 Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.  */
        printLineTask();

        verifyEquals("10 руб 75 коп", priceFormat(10.75));
        verifyEquals("10 руб 5 коп", priceFormat(10.055));


        /** 12 Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.  */
        printLineTask();

        System.out.println(weight(10.050));


        printLineTask();
        /** 13 Написать метод, который принимает на вход необходимые параметры, и печатает чек. Этот метод тестировать
         * не нужно, но необходимо использовать все раннее написанные методы (в задачах из Part 1 тоже могут пригодиться некоторые методы) */

        System.out.println(checkOfBread(30.50, 5, "Хлеб"));

        printLineTask();
        /** 14 Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
         * число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
         Например:
         год рождения 1999
         1 + 9 + 9 + 9 = 28
         2 + 8 = 10
         1 + 0 = 1
         Счастливое число - 1   */

        System.out.println(luckyNumber(2000));

        printLineTask();
        /** 15 а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
         Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

         b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать */

        String expectedResult = "Среднее значение = 4 медиана = 4";
        String expectedResult1 = "Среднее значение 11 отличается от медианы 6 на 5.0";
        verifyEquals(expectedResult,differenceBetweenAvgMediana(2,4,6));
        verifyEquals(expectedResult1,differenceBetweenAvgMediana(2,6,25));

        printLineTask();
        /** 16 Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
         *  и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”. */




    }
}
