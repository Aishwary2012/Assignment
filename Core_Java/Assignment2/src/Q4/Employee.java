package Q4;

abstract public class Employee {
    private int eid;
    private String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
    public int getId() {
        return eid;
    }
    public String getName() {
        return ename;
    }

    abstract public double getPayment() ;
    @Override
    public String toString() {
        return "Employee [id=" + eid + ", name=" + ename + "]";
    }
}
