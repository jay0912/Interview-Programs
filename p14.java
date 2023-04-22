//14) WAP to calculate an angle between hour and minute hand. (Hours and minutes should be 
//taken from user).
import java.util.Scanner;

public class p14 
{
    static int angel(double hr, double min)
    {
        int hr_angel = (int)(0.5 * (hr*60 + min));
        int min_angel = (int)(min*6);

        int angel = Math.abs(hr_angel - min_angel);
        angel = Math.min(360-angel, angel);
        
        return angel;
    }
    public static void main(String[] args) 
    {
        int hr, min;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter HOUR : ");
        hr = sc.nextInt();
        System.out.print("ENter MINUTE : ");
        min = sc.nextInt();
        sc.close();

        System.out.println("Total Angel : "+angel(hr,min)+" degree");
    }    
}
