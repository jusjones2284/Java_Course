public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 850, "jusjones@me.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());

        //you can create an object by instantiating a class
        //you can create many objects using a single class.
        //Each may have unique attributes or values
        //object and instance are interchangable terms
    }
}