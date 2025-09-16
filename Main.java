// 1.import scanner class 
import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Lets play Madlibs!");
      // 2. set up a scanner object
      Scanner input = new Scanner(System.in);

      //System.in refers to the physical keyboard!

      // 3. use the scanner to take input
      System.out.println("Mia");
      String player = input.nextLine();
      System.out.println("welcome," + player);


   }
}
