//3.1) WAP to find a Factor of a given number (iterative).

import java.util.Scanner;

public class p3_1 
{
    public static void main(String[] args)
    {
        int n, i;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to find Factors : ");
        n = sc.nextInt();

        sc.close();

        System.out.println("\nFactors of the given Number "+n+" is :");
        for (i=1; i<=n; i++)
        {
            if(n%i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}