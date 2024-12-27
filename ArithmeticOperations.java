// Program 6: Perform arithmetic operations using switch and scanner
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide 5.Quit");
            int choice = sc.nextInt();
            if (choice == 5) break;

            

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                case 5: 
                System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
