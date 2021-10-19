/**
   Celia Liberman
   CS 110
   Savings account class
*/

public class SavingsAccount
{
   // Create the fields
   private double balance;  // Account balance
   private double interestRate;  // The account interest rate
   private double lastInterest;  // The interest earned last month
   
   /**
      The constructor sets the opening balance
      and interest rate.
      @param bal The opening balance of the account.
      @param interest.
   */
   
   public SavingsAccount(double bal, double interest)
   {
      balance = bal;
      interestRate = interest;
   }
   
   
   /**
      The deposit method adds an amount to
      the account balance.
      @param amount The amount to be deposited.
   */
   
   public void deposit(double amount)
   {
      balance += amount;   
   }
   
   
   /**
      The withdraw method subtracts an amount
      from the account balance.
      @param amount The amount to be withdrawn.
   */
   
   public void withdraw(double amount)
   {
      balance -= amount;
   }
   
   /**
      The addIterest method calculates and adds the 
      interest the account earned last month. 
   */
   
   public void addInterest()
   {
      balance += ((interestRate / 100) / 12) * balance;
   }
   
   
   /**
      The getBalance method returns the value 
      corresponding to the account balance.
      @return balance The current account balance.
   */
   
   public double getBalance()
   {
      return balance;
   }
   
   
   /**
      The getInterestRate method returns the annual 
      interest rate.
      @return interestRate The account's annual interest
      rate.
   */
   
   public double getInterestRate()
   {
      return interestRate;
   }
   
   
   /**
      The getLastInterest method calculates the interest
      earned in the last month.
      @return The interest calculated based on interest
      rate and the account balance that was earned.
   */
   
   public double getLastInterest()
   {
      return (((interestRate / 100) / 12) * balance);
   }
}