//4) WAP to find a factorial of a given integer (iterative and recursive).

import java.util.Scanner;

public class p4_1
{
    public static void main(String[] args) 
    {
        int n, i, fact=1;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial  : ");
        n = sc.nextInt();
        sc.close();

        //By Itterative
        for(i=1; i<=n; i++)
        {
            fact = fact * i;
        }

        System.out.print("By Iterative Factorial of "+n+" is : "+fact);

        //By recursive
        // public class facts(int n)
        // {
        //     if(n==0)
        //     {
        //         return 1;
        //     }
        //     else
        //     {
        //         return n*fact(n-1);
        //     }
        // }

        // factorial = facts(n);

        // System.out.print("By Recursive Factorial of "+n+" is : "+factorial);
    }
}