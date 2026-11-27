public class SalesEmployee extends Employee {

    private double salesAmount;

    public SalesEmployee(String employeeName, double salesAmount) {
        super(employeeName);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateBonus() {
        return calculateBonus(salesAmount);
    }

    @Override
    public double calculateBonus(double amount) {
        return amount * 3 / 100.0;
    }
}