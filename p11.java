//10)  WAP to find weather given number is Armstrong number is not.
import java.util.Scanner;

public class p11 
{
    
    public static void main(String[] args) 
    {
        int n,reminder,temp=0,count=0,result=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        sc.close();

        temp = n;
        while(temp>0)
        {
            temp/=10;
            count++;
        }

        temp = n;
        while(temp>0)
        {
            reminder = n%10;
            result += Math.pow(reminder, count);
            temp/=10;
        }

        if(n==result)
        {
            System.out.println("Given number "+n+" is Armstrong.");
        }
        else
        {
            System.out.println("Given number "+n+" is not Armstrong.");
        }
    }    
}
