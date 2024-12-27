// Program 5: Print patterns
public class Patterns {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        
        // Pattern 3
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        
        System.out.println();

        // Pattern 4
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= 10 - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
