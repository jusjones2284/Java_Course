public class bankAccount {

    private String number;
    private double balance;
    private String customer;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $ " + balance);
    }

    public void withdrawFunds(double withdrawlAmount){
        if (balance - withdrawlAmount < 0){
            System.out.println("Insufficient Funds! You only have $ " + balance + "in your account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal of $" + withdrawlAmount + " processed, Remaining balance = $" + balance);
        }
    }
    public String getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomer(){
        return customer;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone(){
        return customerPhone;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public  void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

}
