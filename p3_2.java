//3.2) WAP to find a Factor of a given number (recursive).
import java.util.Scanner;

public class p3_2 
{
    static void factors(int n, int i)
    {

        if(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
            factors(n, i+1);
        }
        
        
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        sc.close();

        factors(n, 1);

    }    
}
