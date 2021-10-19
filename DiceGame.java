import java.util.Random;
// This program will simulate rolling a 6-sided die
// 50 times.
public class DiceGame
{
 // roll die 50 times and display result
 // takes in an already instantiated Random object.
 public static void printDiceRolls(Random r)
 {
 int num;
 int count = 0;
// roll 50 times (displaying each roll)
 for (int i = 1; i < 50; i++)
 {
 num = r.nextInt(6) + 1;
 System.out.print(num + " ");
 if (num == 6)
 count++;
 }
// how many were 6s?
 double percent = count/50.0*100;
 System.out.println("\n" + percent + "% were 6s");

 }
 public static void main(String [] args)
 {
 Random random = new LoadedDice();
 printDiceRolls(random);

 }
 }
