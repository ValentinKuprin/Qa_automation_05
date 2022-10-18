package advance.Hw.Hw7;

public class Director extends Manager{
    public double getNumberOfSubordinates() {
        return super.getNumberOfSubordinates();
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        super.setNumberOfSubordinates(numberOfSubordinates);
    }

    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {

            return super.getSalary();
        } else {

            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }
}
