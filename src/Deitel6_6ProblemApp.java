/**
 *
 * @author ARIANS
 */
import java.util.Scanner;

public class Deitel6_6ProblemApp {

    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

       
        /* Initialization Phase */
        
        Scanner input = new Scanner(System.in);
        int num1, num2;

       
        /* Processing Phase */
        
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        int result = gcd(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);

       
        /* Termination Phase */
        
        input.close();
        System.out.println("Program finished.");
    }
}
