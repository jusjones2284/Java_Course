public class Worker {

    private String name;
    private String birthdayDate;
    protected String endDate;
    //set by a method either in class or subclass

    public Worker(){

    }

    public Worker(String name, String birthdayDate){
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthdayDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
