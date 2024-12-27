// Program 7: Example of jumping statements
public class JumpingStatements {
    public static void main(String[] args) {
        // Break statement example
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
            {
                 break;
            }
            System.out.println("i = " + i);
        }

        System.out.println();

        // Continue statement example
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
            {
                 continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println();

        // Return statement example
        System.out.println("Before return statement");
        if (true) return;
        System.out.println("This will not be printed.");
    }
}