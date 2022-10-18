package advance.Hw;

public class Hw4 {
    public static void main(String[] args) {

        /**
         * Задача №1
         */

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");

            }

            System.out.println();
        }


        /**
         * Задача №2
         */
        {
            int j = 0;

            for (int i = 10; i >= 0; i--) {
                for (j = 0; j < i; ) {
                    System.out.print(j + " ");
                    j++;
                }
                System.out.println();

                if (j < 11) {
                    for (; j < 11; j++) {
                        System.out.print("  ");
                    }
                }
            }
        }


        /**
         * Задача №3
         */
//        int i = 10;
//        int j = i - 1;
//        for (; i >= 0; i--) {
//            for (; j >= 0; ) {
//                System.out.print(j + " ");
//                j--;
//
//                if (j == 0) {
//                    for (; j < i - 1; j++) {
//                        System.out.print(j + " ");
//                    }
//                }
//
//                System.out.println();
//            }
//
//            i--;
//        }
    }
}

