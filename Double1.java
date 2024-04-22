import java.util.Scanner;
public class Double1 {
  public static void main(String[] arg) throws Exception {
    Scanner s = new Scanner(System.in);
    double a = s.nextDouble();

    if ((a % 1) == 0) {
      System.out.println("It's not a double number");
    } else {
      throw new Exception("It's a double number");
    }
  }
}
