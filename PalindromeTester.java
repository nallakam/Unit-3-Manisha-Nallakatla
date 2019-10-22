import java.util.Scanner;

public class PalindromeTester {
  public static void main(String[] args) {

    Scanner choice = new Scanner(System.in);
    System.out.println("Would you like to enter a palindrome? Yes or No?");
    String response = choice.next();

    if (response.equals("Yes")) {

    Scanner palindrome = new Scanner(System.in);
    System.out.println("Enter a palindrome.");

    String palindromeInput = palindrome.next();

    ReversedPalindrome rp = new StringBuilder();

        for(int i = palindromeInput.length() - 1; i >= 0; i--)
        {
            rp.append(palindromeInput.charAt(i));
        }

        String reverse = rp.toString();

      if (palindromeInput.equals(reverse)) {
        System.out.println("This is a palindrome!");
      }
      else {
        System.out.println("This is not a palindrome!");
      }
    }
    else {
      System.out.println("Okay lol");
    }
  }
}
