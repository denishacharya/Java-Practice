public class IsLeapYear{
 
    public static void isLeap(int y){
        if(y%400 == 0 || y%100 != 0 && y%4 == 0)
        System.out.println(y+" is a leap year.");

        else{
        System.out.println(y+" is not a leap year.");
        }
    }
   
public static void main(String[] args) {

    int year = 2020;
    
    isLeap(year);
    
}
}