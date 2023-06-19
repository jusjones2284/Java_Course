public class Customer {

    private String name;//instance field
    private int creditLimit;//instance field
    private String emailAddress;

    public Customer(){
        this("Nobody", "nobody@nowhere.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

//    public Customer(){
//
//    }
//
//    public Customer(String name, String emailAddress){
//
//    }

    public String getName(){
        return name;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

}
