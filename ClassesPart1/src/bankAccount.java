public class bankAccount {

    private int accountNumber = 0;
    private int accountBalance = 0;
    private String customerName = "";
    private String email =  "";
    private int phoneNumber = 0;

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getAccountBalance(){
        return accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance){
        this.accountBalance =accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName =  customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int accountDeposit(int accountBalance) {

        return accountBalance;
    }

    public int accountWithdrawal(int accountBalance){
        return accountBalance;
    }





}
