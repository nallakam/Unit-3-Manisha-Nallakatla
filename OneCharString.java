import java.util.Scanner;

public class OneJavaString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string.");

    String string = scan.next();

    int stringLength = string.length();

    int index = 1;

    while (index < stringLength) {
      System.out.println(string.charAt(index));
      index++
    }
  }
}
