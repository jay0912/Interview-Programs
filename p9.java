//9) WAP to find whether a number is Odd or Even without using a % operator
import java.util.Scanner;

public class p9 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();

        sc.close();

        while(n>=0)
        {
            n = n - 2;
            if(n==0 || n==1)
            {
                break;
            }
        }

        if(n==0)
        {
            System.out.println("The number is EVEN.");
        }
        else
        {
            System.out.println("The number is ODD.");
        }
    }    
}
