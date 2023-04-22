// 22) Print a following patterns

//    1
//   A B
//  2 3 4
// C D E F

// *********
//  *******
//   *****
//    ***
//     *

// *********
// **** ****
// ***   ***
// **     **
// *       *
import java.util.Scanner;

public class p22 
{
    //Pattern 1
    static void pattern1(int n)
    {
        int num=1;
        char ch = 'A'; 

        System.out.println("\nPATTERN 1 : ");
        for(int i=1; i<=n; i++)
        {
            for(int k=n; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                if(i%2 != 0)
                {
                    System.out.print(num+" ");
                    num++;
                }
                else
                {
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }

    //pattern 2
    static void pattern2(int n)
    {

        System.out.println("\nPATTERN 2 : ");
        for(int i=n; i>=1; i--)
        {
            for(int k=n; k>=i; k--)
            {
                System.out.print("  ");
            }

            for(int j=(i*2)-1; j>=1; j--)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        } 
    }

    //pattern 3
    static void pattern3(int n)
    {

        System.out.println("\nPATTERN 3 : ");
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

        pattern1(n);
        pattern2(n);
        pattern3(n);  

    }
}
