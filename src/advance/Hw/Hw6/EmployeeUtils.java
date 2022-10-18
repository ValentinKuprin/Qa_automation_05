package advance.Hw.Hw6;

public class EmployeeUtils {

    public static String findName(String[] arr, String name) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(name)) {
                    return arr[i];
                }
            }
        }
        return "Нет такого имени";
    }

    public static String findNameSubstring(String[] arr, String nameSubstring) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains(nameSubstring)) {
                    return arr[i];
                }
            }
        }
        return "Нет такого имени";
    }

    public static int sumOfSalary(int[] arr) {
        int result = 0;
        if (arr.length > 0) {
            for (int j : arr) {
                result += j;
                return result;
            }
        }
        return -1;
    }

    public static int minSalary(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                return min;
            }
        }
        return -1;
    }

    public static int maxSalary(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                return max;
            }
        }
        return -1;
    }



}
