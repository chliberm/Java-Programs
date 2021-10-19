/**
   Celia Liberman
   CS 110
   This program provides subtraction practice by testing the user
   with 5 subtraction problems and informing them whether they
   got the answer right or not. The user also provides a range from
   which the program chooses 2 random number, subtracting the smaller
   from the larger.
*/ 

import java.util.Scanner;  // needed for user input
import java.util.Random;  // needed for generating 

public class SubtractionTutor
{
   public static void main(String[] args)
   {
      // set the min and max values to be entered as constants
      final int MIN_VALUE = 1,
                MAX_VALUE = 9999;
      
      // print intro message
      System.out.println("Welcome to the Subtraction Tutor");
      System.out.println("You will supply a low value and high value, "
                         + "defining the range");
      System.out.println("of values to be included in your quiz. You "
                         + "will get 5 problems.");
      System.out.println("The values must be positive and no longer than "
                         + "9999");
     
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in);
      
      // get low value from user and validate
      int lowValue;
      System.out.print("Low value : ");
      lowValue = keyboard.nextInt();
      
      while (lowValue < MIN_VALUE || lowValue > MAX_VALUE)
      {
         System.out.println("Please eneter an integer between 1 and 9999");
         System.out.print("Low value : ");
         lowValue = keyboard.nextInt();
      }
      
      // get high value from user and validate
      int highValue;
      System.out.print("High value : ");
      highValue = keyboard.nextInt();
      
      while (highValue < MIN_VALUE || highValue > MAX_VALUE)
      {
         System.out.println("Please eneter an integer between 1 and 9999");
         System.out.print("High value : ");
         highValue = keyboard.nextInt();
      }
      System.out.println("");
      
      // create a for loop that runs five times
      int nCorrectAnswers = 0;
      for (int problem = 1; problem <= 5; problem++)
      {
         // create a Random class object
         Random randomNumbers = new Random();
         
         // get two random numbers
         int number1,
             number2,
             solution;
             
        number1 = randomNumbers.nextInt(highValue - lowValue) + lowValue;
        number2 = randomNumbers.nextInt(highValue - lowValue) + lowValue;
        
         
         if (number1 < number2)  
         {
            solution = number2 - number1;
            System.out.printf("%6d\n", number2);
            System.out.printf("-%5d\n", number1);
            System.out.println(" -----");
         }
         else
         {
            solution = number1 - number2;
            System.out.printf("%6d\n", number1);
            System.out.printf("-%5d\n", number2);
            System.out.println(" -----");
         }                           
         
         // get user's answer
         int userAnswer;
         System.out.print("Answer? ");
         userAnswer = keyboard.nextInt();
         
         // test is user's answer equals the solution and display message accordingly
         if (userAnswer == solution)
         {
            System.out.println("Correct!");
            nCorrectAnswers++;
         }
         else
         {
            System.out.printf("Incorrect! The answer is %d\n", solution);
         }
         System.out.println("");
         System.out.println("");
      }  
     
      // total the times the user got the problem right and display message
      System.out.println("This quiz is over");
      if (nCorrectAnswers == 5)
         System.out.println("Excelent! You got all 5 correct.");
      else if (nCorrectAnswers < 5 && nCorrectAnswers > 2)
         System.out.println("You got over half correct, practice makes perfect!");
      else
         System.out.println("You got less than half correct, you need to spend time practicing");
   }
}