package advance.Hw.Hw7;

public class Month {

    private String nameOfMonth;
    private int days;
    private int countWorkers;

    public Month(String nameOfMonth, int days, int countWorkers) {
        this.nameOfMonth = nameOfMonth;
        this.days = days;
        this.countWorkers = countWorkers;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }


    public int getDays() {
        return days;
    }


    public int getCountWorkers() {
        return countWorkers;
    }
}
