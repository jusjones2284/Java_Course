public class Main {
    public static void main(String[] args) {
        bankAccount bobsAccount = new bankAccount("12345", 1000.00, "Bob Brown", "bobbrown@email.com", "(504)235-8898");
        System.out.println(bobsAccount.getCustomerEmail() + " " + bobsAccount.getCustomerPhone());


//        bobsAccount.setBalance(100.00);
//        bobsAccount.setNumber("123456");
//        bobsAccount.setCustomerPhone("(504)2358898");
//        bobsAccount.setCustomerEmail("bobs@email.com");
//        bobsAccount.setCustomerName("Bob Brown");
        System.out.println(bobsAccount.getBalance());
        bobsAccount.depositFunds(100.50);
        bobsAccount.withdrawFunds(100);
    }
}