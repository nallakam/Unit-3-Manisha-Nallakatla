//NOTES
//Use a scanner to prompt user for number of games played and number of games won
//Use if statements to coniditionally calculate the percentage or respond with
//an error message
//Use a while loop to continue to prompt the user for values until they make
//logical sense

import java.util.Scanner;

public class WinPercentage {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    double gamesPlayed = 3;

    double gamesWon = 5;

    while (gamesWon>gamesPlayed || gamesWon<0 || gamesPlayed<0 || gamesPlayed == 0 || (gamesPlayed%1 != 0) || (gamesWon%1 != 0)){

      System.out.println("How many games did you play?");
      gamesPlayed = scan.nextDouble();

      System.out.println("How many games did you win?");
      gamesWon = scan.nextDouble();

      if (gamesWon%1 != 0) {
        System.out.println("Enter integers only!");
      }

      if (gamesPlayed%1 != 0) {
        System.out.println("Enter integers only!");
      }

      if (gamesWon>gamesPlayed) {
        System.out.println("You can't win more games than you play!");
      }

      if (gamesWon<0) {
        System.out.println("You can't win a negative number of games!");
      }

      if (gamesPlayed<0) {
        System.out.println("You can't play a negative number of games!");
      }

      if (gamesPlayed == 0) {
        System.out.println("You must play more than 0 games!");
      }

    }

        System.out.println("You won " + ((gamesWon/gamesPlayed)*100) + "% of your games!");

      }

  }
