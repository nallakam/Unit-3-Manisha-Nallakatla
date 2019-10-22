import java.util.Scanner;

public class Multiples {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int num = 0;
    int multiples = 0;

    boolean valuesGood = false;
    while (valuesGood == false) 
        if (num == 0) {

        System.out.println("Enter a number to get multiples.");

        num = scan.nextInt();

        System.out.println("Up to what number of multiples?");

        multiples = scan.nextInt();
      }

        else if (num <= 0 || multiples < 0) {

        System.out.println("Enter positive numbers only.");

        System.out.println("Enter a number to get multiples.");

        num = scan.nextInt();

        System.out.println("Up to what number of multiples?");

        multiples = scan.nextInt();
        }

        else if (multiples < num) {
          System.out.println("Your multiple value must be greater than your input.");

          System.out.println("Enter a number to get multiples.");

          num = scan.nextInt();

          System.out.println("Up to what number of multiples?");

          multiples = scan.nextInt();
        }
        else {
          valuesGood = true;
        }
        }
    int lineCount = 0;

    for (int i = 0; (num*i) < multiples; i++) {
      if ((lineCount % 5) == 0 && i != 1) {
      System.out.print("\n");
      }
    System.out.print(i*num + " ");
    lineCount++;
    }
    }
}
