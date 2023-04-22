//Imcomplete

import java.util.Scanner;

public class Pattern1 
{
    
    //pattern 3
    static void pattern(int n)
    {

        System.out.println("\nPATTERN  : ");

        int v=2;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            } 
        
            for(int k=1; k<=v; k++)
            {
                System.out.print(" ");
                
            }
            v+=4;
             

            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>=n; i--)
        {
             for(int j=(i*2)-1; j>=1; j--)
             {
                System.out.print("* ");   
             }
            
            System.out.println();
        }

        int c=2;
        for(int i=n-1; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            } 
        
            for(int k=1; k<=c; k++)
            {
                System.out.print(" ");
                
            }
            c+=4;
             

            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to print pattern : ");
        n = sc.nextInt();
        sc.close();

        pattern(n);  

        
    }    
}
