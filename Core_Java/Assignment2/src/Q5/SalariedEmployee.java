package Q5;

public class SalariedEmployee extends  Employee{
    private double fixedWeeklySalary;

    public SalariedEmployee(int id, String name, double fixedWeeklySalary) {
        super(id, name);
        this.fixedWeeklySalary = fixedWeeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "SalariedEmployee{" +
                "fixedWeeklySalary=" + fixedWeeklySalary +
                '}';
    }

    @Override
    public double getPayment() {
        return fixedWeeklySalary;
    }
}
