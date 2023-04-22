//8) WAP to find a total odd and total even digit of a given number.
import java.util.Scanner;

public class p8 
{
    public static void main(String[] args) 
    {
        int n,i,odd=0,even=0,reminder;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Digit : ");
        n = sc.nextInt();

        sc.close();

        for(i=0; i<n; i++)
        {
            reminder = n % 10;
            if(reminder % 2 == 0)
            {
                even++;
            }
            if(reminder % 2 != 0)
            {
                odd++;
            }
            n = n/10;
        }

        System.out.println("Total EVEN : "+even);
        System.out.println("Total ODD : "+odd);
    }    
}
