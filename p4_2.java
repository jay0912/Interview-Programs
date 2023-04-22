//4.2) WAP to find a Factorial of a given number (recursive).
import java.util.Scanner;

public class p4_2 
{
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] args) 
    {
        int n,fact=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();
        sc.close();

        fact = factorial(n);
        System.out.print("Facorial of the "+n+" is : "+fact);



    }
}
