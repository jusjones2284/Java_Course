public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdayDate, String hireDate, double hourlyPayRate) {
        super(name, birthdayDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}
