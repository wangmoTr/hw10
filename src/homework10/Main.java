package homework10;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.deposit(500));
        System.out.println(myAccount.deposit(150));
        System.out.println(myAccount.deposit(35));
        System.out.println(myAccount.withdraw(40));
        System.out.println(myAccount.withdraw(120));
        myAccount.getBalance();
        myAccount.setBalance();
    }

}
/*


Create a new file Homework10.java file in IntelliJ IDEA
Create a new Bank Account class
A balance field should be private now and be equal to zero by default
Create getter and setter methods: getBalance() and setBalance()
- getter should simply return the balance value and print out to the console: "Your current balance is ${insert an actual amount here}"
- setter accepts positive and negative values and does the following (in addition to the calculations):
   - check if the balance is not negative after a transaction and either:
      - print the following to the console "Your balance has changed by ${insert an actual amount here} and now it is: ${insert an actual balance here}"
      or
      - print the following to the console "Withdrawal of ${insert an actual amount here} cannot be completed. Your balance is ${insert an actual balance here}". Do not change the balance!
Check if the customer deposits $500, $150 and $35 and withdraws -$40 and -$120 the balance is correct
Check if additionally customer attempts to withdraw -$900 (over the balance), transaction fails
Create a new branch and commit your changes
Push your code to a remote repository
Create a merge request
Copy and paste the link to the field below, so we can check your homework
 */