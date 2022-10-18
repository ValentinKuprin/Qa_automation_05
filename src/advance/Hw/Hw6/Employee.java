package advance.Hw.Hw6;

import advance.Hw.Hw5.Person;

public class Employee extends Person {

    int salary;

    public Employee(String name, int age, char sex, int yearOfBirth, int salary) {
        super(name, age, sex, yearOfBirth);
        this.salary = salary;
    }

    public Boolean isSameName(Employee employee) {
        if (this.getName().equals(employee.getName())) {
            return true;
        }
        return false;
    }
}
