package advance.Hw.Hw5;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char sex;

    private int yearOfBirth;

    public Person(String name, int age, char sex, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        if (this.sex == 'M') {
            return "Mr." + name;
        } else if (this.sex == 'F') {
            return "Ms." + name;
        } else {
            return this.sex + name;
        }
    }

    public void printName () {
        System.out.println(this.name);
    }

}
