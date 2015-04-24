package exercises.chapter3.InterestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import exercises.chapter3.InterestCalculator.Account;

/**
 * Unit test for simple App.
 */
public class AccountTest {
  
  /**
   * Testing account balance and interest calculations
   */
  @Test
  public void testBalanceInterest() {
    
    Account account = new Account(20.); // Create a new instance of class Account 
    
    account.setBalance(100.);           // set account's balance
    Account.setInterestRate(1.0);       // Setting the global interest rate
    account.applyInterest();            // raise balance by one year's interest.
    account.applyInterest(3);           // raise balance by three years compounded interest 
 
    assertTrue(account.getBalance() == 104.06040100000001);

    account.setBalance(-1000.);           // You owe me something!
    account.applyInterest(3);
    
    assertTrue(account.getBalance() == -1520.8749999999998); 
  
  }
}
