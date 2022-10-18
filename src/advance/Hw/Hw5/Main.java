package advance.Hw.Hw5;

import advance.Hw.Hw6.Employee;

public class Main {
    public static void main(String[] args) {

        Person anna = new Person("Anna", 30, 'F', 1990);
        Person Misha = new Person("Misha", 36, 'M', 1985);
        System.out.println(anna.getName());
        System.out.println(anna.getAge());
        System.out.println(anna.getSex());

        Employee e1 = new Employee("Igor", 36, 'M', 1978, 15000);
        Employee e2 = new Employee("Kirill", 36, 'M', 1978, 15000);


        System.out.printf(String.format("name: %s, sex: %s, age: %s", anna.getName(), anna.getSex(), anna.getAge()));

        System.out.println(e1.isSameName(e1));
        System.out.println(e1.isSameName(e2));
    }
}
