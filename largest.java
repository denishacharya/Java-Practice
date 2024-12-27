
import java.util.Scanner;

public class largest{
    public static void large(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a + " is a largest number.");
        }

        else if(b>a && b>c)
        {
            System.out.println(b + " is a largest number.");
        }

        else
        {
            System.out.println(c + " is a largest number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter c");
        int c = sc.nextInt();

        large(a, b, c);
    }


}