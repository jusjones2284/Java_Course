public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Justin Jones", 850.00,
                "jusjones@me.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());

    }
}