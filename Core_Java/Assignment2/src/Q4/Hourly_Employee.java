package Q4;

public class Hourly_Employee extends Employee{
    private double  hourlyRate;
    private int numberOfHours;

    public Hourly_Employee(int eid, String ename,double hourlyRate,int numberOfHours) {
        super(eid, ename);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return super.toString()+ "Hourly_Employee{" +
                "hourlyRate=" + hourlyRate +
                ", numberOfHours=" + numberOfHours +
                '}';
    }

    @Override
    public double getPayment() {
        return hourlyRate*numberOfHours;
    }
}
