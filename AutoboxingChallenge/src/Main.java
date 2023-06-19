import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class Main {

    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Customer jus = new Customer("Justin J", 200000);

    }
}

class Bank{

    private String name;
    private ArrayList<Customer>customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    private Customer getCustomer(String customerName){

        for (var customer: customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
    }
}