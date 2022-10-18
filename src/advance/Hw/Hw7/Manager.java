package advance.Hw.Hw7;

public class Manager extends Employee{

    private int numberOfSubordinates;

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
}
