package advance.Hw.Hw7;

public class Manager extends Employee{

    private int numberOfSubordinates;
    private String name;
    private int age;
    private char gender;
    private double dailySalary;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public char getGender() {
        return gender;
    }

    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public double getDailySalary() {
        return dailySalary;
    }

    @Override
    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {

            return super.getSalary();
        } else {

            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 3);
        }
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getCountWorkers() * super.getDailySalary();
        }
        return totalSalary * (1 + (getNumberOfSubordinates() * 0.01));
    }
}
