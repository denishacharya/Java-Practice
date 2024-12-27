// Program 8: Calculate internal marks and percentage
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for JAVA: ");
        int javaMarks = sc.nextInt();
        System.out.print("Enter marks for C: ");
        int cMarks = sc.nextInt();
        System.out.print("Enter marks for Math: ");
        int mathMarks = sc.nextInt();
        System.out.print("Enter marks for DSA: ");
        int dsaMarks = sc.nextInt();
        System.out.print("Enter marks for DBMS: ");
        int dbmsMarks = sc.nextInt();

        int totalMarks = javaMarks + cMarks + mathMarks + dsaMarks + dbmsMarks;
        boolean passed = javaMarks >= 40 && cMarks >= 40 && mathMarks >= 40 && dsaMarks >= 40 && dbmsMarks >= 40;

        double percentage = (double) totalMarks / 5;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        if (passed) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}
