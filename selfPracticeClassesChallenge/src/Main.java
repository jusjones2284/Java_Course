public class Main {
    public static void main(String[] args) {
        bankAccount bobsAccount = new bankAccount();
        bobsAccount.setNumber("12345");
        System.out.println(bobsAccount.getNumber());
        bobsAccount.setBalance(1000);
        System.out.println(bobsAccount.getBalance());
        bobsAccount.setCustomer("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("504235898");
        bobsAccount.withdrawFunds(900);
        bobsAccount.withdrawFunds(104);
        bobsAccount.withdrawFunds(99.99);
        bobsAccount.depositFunds(4500);
        System.out.println("bob's balance: " + bobsAccount.getBalance());

    }
}