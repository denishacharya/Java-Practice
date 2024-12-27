import java.util.*;

public class IsAlphabet{

    public static void alphabet(char x)
    {
        x =Character.toUpperCase(x);
        if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
        {
            System.out.println(x+ " is a Vowel");
        }

        else{
            System.out.println(x+ " is a Constant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet");
        char x = sc.next().charAt(0);

        alphabet(x);
        
            

    }
}