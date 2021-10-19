public class SavingsAccountTest
{
   public static void main(String[] args)
   {
      double initialBalance;
      double balance;
      double lastInterest;
      double total;
      
      SavingsAccount account = new SavingsAccount(500.00, 2.5);
      
      initialBalance = account.getBalance();
      
      System.out.println(initialBalance);
      
      account.deposit(100.00);
      
      balance = account.getBalance();
      
      System.out.println(balance);
      
      account.withdraw(20.00);
      
      balance = account.getBalance();
      
      System.out.println(balance);
      
      lastInterest = account.getLastInterest();
      
      System.out.println("Interest: " + lastInterest);
      
      account.addInterest();
      
      total = account.getBalance();
      
      System.out.println("The total amount in the account is " + total);
      
      
   }
}