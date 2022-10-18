package advance.Hw.Hw7;

public class Employee {

    private String name;
    private int age;
    private char gender;
//    private int yearOfBirthday;
//    private double salary;
//    private double baseSalary;
    private double dailySalary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//    public int getYearOfBirthday() {
//        return yearOfBirthday;
//    }

//    public void setYearOfBirthday(int yearOfBirthday) {
//        this.yearOfBirthday = yearOfBirthday;
//    }

//    public double getSalary() {
//        return salary;
//    }

//    public double getBaseSalary() {
//        return baseSalary;
//    }

//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getCountWorkers() * getDailySalary();
        }
        return totalSalary;
    }
}
