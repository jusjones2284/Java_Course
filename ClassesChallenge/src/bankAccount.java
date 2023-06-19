public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public bankAccount(){
        //name has to be the same as the class
        //has no return type
        //access modifiers are keywords that can be used to control the
        //visibility of fields, methods, and constructors in a class. the four access
        //modifiers in Java are public, protected, default, and private.
        this("56789", 2.50, "Default name", "default address", 000000);
        System.out.println("Empty constructor called");

    }

    public bankAccount(String number, double balance, String customerName, String email, int customerPhone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        this.customerPhone = customerPhone;

    }

    public bankAccount(String customerName, String customerEmail, int customerPhone) {
       this("99999", 100.55, customerName, customerEmail,customerPhone);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawlAmount){
        if(balance - withdrawlAmount < 0){
            System.out.println("Insufficient Funds! You only have $ " + balance + "in your account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal of $" + withdrawlAmount +
                    " processed, Remaining balance = $" + balance);

        }
    }
    public String getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public int getCustomerPhone(){
        return customerPhone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }




}
