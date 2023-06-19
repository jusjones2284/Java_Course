public class Main {
    public static void main(String[] args) {

//        bankAccount bobsAccount = new bankAccount("122345", 100000, "Bob Brown", "myemail@bob.com", 3323434);
        bankAccount bobsAccount = new bankAccount();
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone(504235);
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(500);
        bobsAccount.withdrawFunds(50);

        bankAccount timsAccount = new bankAccount("Tim", "time@email.com", 234355);
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName() + " " + timsAccount.getBalance());

        //A constructor is used in the creation of an object,
        //thats an instance of a class. it is a special type of code
        //block that has a specific name and parameters, much like a method.
        //if a class contains no constructor declarations, then a default constructor
        //is implicity declared.
        //this constructors has no parameters and is often called the no args(no arguments)
        //constructor
        //Constructor chaining is when one constructor explicity calls another
        //overloaded constructor. you can call a constructor only from another constructor



    }
}