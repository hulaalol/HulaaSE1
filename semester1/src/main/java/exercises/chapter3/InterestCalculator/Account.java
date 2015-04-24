package exercises.chapter3.InterestCalculator;

/**
 * Dealing with account balances and interest calculations.
 * 
 */
public class Account {

  private static double         
  interestRate = 1.5,           // applied to positive balances
  NegativeInterestRate = 15.;    // applied to negative balances
  							

  private double balance;       // Balances apply per-account thus in contrast
                                // "static" must not appear here.

  /**
   * Create a new account having a balance of 0.
   */
  public Account() {            // Default Constructor. This one has no parameters and
    setBalance(0);              // thus creates an initially empty account. 
  }

  /**
   * Create a new account having of given initial balance.
   * 
   * @param balance 
   *           The account's initial balance.
   */
  public Account(double balance) {  // Non-default constructor creating an account
    setBalance(balance);            // with (possibly) non-zero balance.
  }

  /**
   * @return The account's current balance.
   */
  public double getBalance() {
    return balance;
  }
  /**
   * Setting a (possibly) new balance.
   * 
   * @param balance
   *      The desired new balance value. If greater than 10000
   *      a warning message is being issued and the accounts current value will be retained.
   */
  public void setBalance(double balance) {
    if (balance <= 10000) {
      this.balance = balance; // "this" required to resolve name shadowing conflict of formal
                              // parameter name "double stand" with respect to Account.stand .
    } else {
      System.out.println("Balance" + balance + " exceeds " + 10000);
    }
  }
  /**
   * Setting the interest rate common to all accounts. This one
   * will be applied to positive balances only. For handling
   * negative balances see {{@link #setDefaultInterestRate(double)}.
   * 
   * @param interestRate The desired (global) interest rate.
   */
  public static void setInterestRate(double interestRate) {  
    Account.interestRate = interestRate;                         
  }
  
  public static void setNegativeInterestRate(double NegativeInterestRate) {  
	    Account.NegativeInterestRate = NegativeInterestRate;                         
	  }
  /**
   * @return The current global interest rate
   */
  public static double getNegativeInterestRate() {
	    return NegativeInterestRate;
	  }
  
  
  public static double getInterestRate() {
    return interestRate;
  }
  

  /**
   * <p>Adding the annual interest to the current balance according to:</p>
   * {@html.extend
<math display="block" xmlns="http://www.w3.org/1998/Math/MathML">
            <mrow>
                <msub>
                    <mi>balance</mi>
                    <mi>1</mi>
                </msub>
                <mo>=</mo>
                <mrow>
                    <mi>balance</mi>
                      <mrow>
                          <mo>(</mo>
                          <mrow>
                              <mi>1</mi>
                              <mo>+</mo>
                              <mfrac>
                                  <mi>interestRate</mi>
                                  <mi>100</mi>
                              </mfrac>
                          </mrow>
                          <mo>)</mo>
                      </mrow>
                </mrow>
            </mrow>
        </math>}
   * <p>Positive balances will receive the value of {{@link #setInterestRate(double)} whereas the
   * calculation of negative  balances will be based on {{@link #setDefaultInterestRate(double)}.</p>
   */
  public void applyInterest() {
    if (0 < balance) {
      balance = balance * (1 + interestRate / 100);
    } else if (balance < 0){
      balance = balance * (1 + NegativeInterestRate / 100);
    }
  }

  /**
   * <p>Adding the interest of several years to the current balance according to:</p>
   * {@html.extend
<math display="block" xmlns="http://www.w3.org/1998/Math/MathML">
            <mrow>
                <msub>
                    <mi>balance</mi>
                    <mi>years</mi>
                </msub>
                <mo>=</mo>
                <mrow>
                    <mi>balance</mi>
                    <msup>
                        <mrow>
                            <mo>(</mo>
                            <mrow>
                                <mi>1</mi>
                                <mo>+</mo>
                                <mfrac>
                                    <mi>interestRate</mi>
                                    <mi>100</mi>
                                </mfrac>
                            </mrow>
                            <mo>)</mo>
                        </mrow>
                        <mi>years</mi>
                    </msup>
                </mrow>
            </mrow>
        </math>}
   *
   *<p>Positive balances will receive the value of {{@link #setInterestRate(double)} whereas the
   * calculation of negative  balances will be based on {{@link #setDefaultInterestRate(double)}.</p>
   * 
   * @param years
   *             the given time period.
   */
  public void applyInterest(int years) {
    if (0 < balance) {
      balance = balance * Math.pow((1 + interestRate / 100), years) ;
    } else if (balance < 0){
      balance = balance * Math.pow((1 + NegativeInterestRate / 100), years) ;
    }
  }

  /**
   * Calculate the expected annual interest without changing the account's balance.
   * 
   * @return
   *       Annual interest to be expected 
   */
  public double getYearlyInterest() {
    return balance * interestRate / 100;
  }
}