//26) WAP to convert a Binary to Decimal. 
import java.util.Scanner;

public class P26 
{
    static double decimal(int n)
    {
        int i=0;
        double deci=0;

        while(n != 0)
        {
            deci = (deci) + ((n%10) * (Math.pow(2,i)));
            i++;
            n/=10;
        }

        return deci;
    }

    public static void main(String[] args) 
    {
        int n;    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binray Number : ");
        n = sc.nextInt();
        sc.close();

        System.out.println("\nConverted Decimal Number of "+n+" is : "+decimal(n));
        
    }
}
