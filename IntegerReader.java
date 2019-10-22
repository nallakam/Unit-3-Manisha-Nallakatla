import java.util.Scanner;

public class IntegerReader {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number to test if it is even, odd, or equivalent to 0.");

    int num = scan.nextInt();

    if (num%2 == 0 && num != 0) {
      System.out.println("This number is an even number.");
    } else if (num == 0) {
      System.out.println("This number is equivalent to 0.");
    } else {
      System.out.println("This number is an odd number.");
    }
  }
}
