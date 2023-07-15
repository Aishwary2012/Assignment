package Q4;

public class Commission_Employee extends Employee {

    private double commisionPercentage;
    private double totalSales;

    public Commission_Employee(int eid, String ename,double commisionPercentage,double totalSales) {
        super(eid,ename);
        this.commisionPercentage = commisionPercentage;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return super.toString()+ "Commission_Employee{" +
                "commisionPercentage=" + commisionPercentage +
                ", totalSales=" + totalSales +
                '}';
    }

    @Override
    public double getPayment() {
        return (commisionPercentage*totalSales)/100;
    }
}
