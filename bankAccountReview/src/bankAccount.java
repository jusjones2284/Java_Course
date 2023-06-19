public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //A constructor is used in the creation of an object, that's
    //it is a special type of code block that has a specific name and
    //parameters, much like a method. it has the same name as the class itself
    //and it doesn't return any values. never include a return type from a constructor
    //not even void. you can and should specify an appropriate access modifier,
    //to control who should be able to create new instances of the class
    //if a class contains no constructor declartions, then a default constructor is
    //implicitly declared. This constructor has no parameters, and is often called
    //the no-args(no arguments) constructor.

    //constructor
    public bankAccount(){
        System.out.println("Empty constructor called.");
    }
    //constructor
    public bankAccount(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        customerEmail = email;
        customerPhone = phone;
    }

    //Constructor overloading is declaring multiple constructors,
    //with different formal parameters. The number of parameters can be
    //different between constructors. or if the number of parameters is the
    //same between two constructors, their types or order of the types must differ


    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(balance - withdrawalAmount < 0 ){
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }


    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public  String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;

    }

    public String getCustomerPhone(){
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }


}
