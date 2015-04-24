package exercises.chapter3.InterestCalculator;


/**
 * Testing simple accounts
 *
 */
public class AccountCreate {
  /**
   * @param args unused
   */
  public static void main(String[] args) {

    Account account = new Account(20.); // Create a new instance of class Account 
    
    account.setBalance(100.);           // set account's balance
    System.out.println("Balance:" + account.getBalance()); // Display account's balance
    
    Account.setInterestRate(1.0);       // Setting the global interest rate
        
    account.applyInterest(3);           // raise balance by three years compounded interest 
    
    System.out.println("balance:" + account.getBalance());  // Display account's balance again
    
    
    Account.setInterestRate(15.);
    account.setBalance(-100.);           // You owe me something!
    account.applyInterest(20);

    System.out.println("balance:" + account.getBalance());  // Display account's balance again
  }
}
