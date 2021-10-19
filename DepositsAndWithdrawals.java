/**
   Celia Liberman
   CS 110
   This program makes use of the SavingsAccount class
   while reading an existing text file. 
*/

import java.util.Scanner;  // For input and files
import java.io.*;   // For files


public class DepositsAndWithdrawals
{
   public static void main(String[] args) throws IOException
   {
      double accountBalance;  // The account's balance
      double withdrawAmount;  // Amount to be withdrawn
      double depositAmount;  // Amount to be deposited
      double annualIntRate;  // Annual account interest rate
      double lastInterest;  // The interest earned from the last month
      
      
      // Create Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Get the annual interest rate of the account from user
      System.out.print("Enter the savings account's annual interest "
                        + "rate: ");
      annualIntRate = keyboard.nextDouble();
      
      // Get the starting account balance
      System.out.print("Starting balance: $");
      accountBalance = keyboard.nextDouble();
      
      
      // Create SavingsAccount object
      SavingsAccount account = new SavingsAccount(accountBalance, annualIntRate);
      
      
      // Open the files
      File file1 = new File("Deposits.txt");
      File file2 = new File("Withdrawals.txt");
      
      Scanner depFile = new Scanner(file1);
      Scanner withFile = new Scanner(file2);
       
         
      // Read through the Deposit.txt file
      while (depFile.hasNext())
      {
         // Read a double from the Deposits.txt
         depositAmount = depFile.nextDouble();
         
         // Adjust the balance
         account.deposit(depositAmount);
         accountBalance = account.getBalance();
         
         // Display the deposit amount
         System.out.printf("Withdraw: $%,.2f, balance = $%,.2f \n", depositAmount, accountBalance);
      }
      
      // Read through the Withdrawals.txt file
      while (withFile.hasNext())
      {         
         // Read a double from the Withdrawals.txt
         withdrawAmount = withFile.nextDouble();
         
         // Adjust the balance
         account.withdraw(withdrawAmount);
         accountBalance = account.getBalance();
         
         // Display the withdrawal amounts
         System.out.printf("Withdraw: $%,.2f, balance = $%,.2f \n", withdrawAmount, accountBalance);
      }
      
      // Get the final balance value
      accountBalance = account.getBalance();
      
      // Get the interest earned
      lastInterest = account.getLastInterest();
      System.out.printf("Interest earned: $%.2f\n", lastInterest);
      
      // Find and display the ending balance
      account.addInterest();
      accountBalance = account.getBalance();
      System.out.printf("Ending balance: $%,.2f", accountBalance);    
   
   }
   
}