package Q4;

public class Salaried_Employee extends Employee {
    private double fixedSalary;
    public Salaried_Employee(int eid, String ename,double fixedSalary) {
        super(eid, ename);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getPayment(){
        return this.fixedSalary;
    }
}
