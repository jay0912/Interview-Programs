//7) WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative). 
import java.util.Scanner;

public class p7_1 
{
    public static void main(String[] args) 
    {
        int n,temp,a,b,i; 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter series n term : ");
        n = sc.nextInt();

        sc.close();

        a=0;
        b=1;
        temp=0;

        System.out.println("\nFibonacii series : ");
        for(i=0; i<n; i++)
        {
            System.out.print(a+" ");
            temp=a+b;
            a=b;
            b=temp;
        }

    }

  

}
