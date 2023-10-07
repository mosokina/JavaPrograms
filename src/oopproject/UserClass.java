package oopproject;

public class UserClass {
    public static void main(String[] args) {
        //calling constructor from class Person
        Person chirag = new Person("chirag", 45, 'M');
        Person becky = new Person("becky", 17, 'F');
        Person vlad = new Person("vlad", 65, 'M');

        //creating object
        Chasebank chaseBank = new Chasebank();

        chirag.setBank(chaseBank); //we are passing an object from the Person class
        // Bank bankAccount - we don't know which bank
        chirag.getBankAccount().deposit(1000);
        chirag.getBankAccount().viewBalance();

        //creating object
        BankOfAmerica boa = new BankOfAmerica();

        becky.setBank(boa);
        becky.getBankAccount().deposit(50000);
        becky.getBankAccount().viewBalance();

        Item shirt = new Item("Java T shirt", 100); //what shopping for
        Item javaBook = new Item("Head First", 47);

        //creating objects
        Amazon beckyAmazonAcc = new Amazon(becky);
        beckyAmazonAcc.placeOrder(10, shirt);

        //transfer from one peron to another, since Chirag doesn't have enough
        becky.getBankAccount().transerMoney(chirag, 5000);

        chirag.getBankAccount().viewBalance();
        becky.getBankAccount().viewBalance();

        Amazon chiragAmazonAcc = new Amazon(chirag);
        chiragAmazonAcc.placeOrder(100, javaBook);

    }
}
