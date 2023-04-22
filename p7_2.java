//7) WAP to find a Fibonacci series up to n terms (n is entered by user) (recursive).
import java.util.Scanner; 

public class p7_2 
{
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return (fibonacci(n-1)+fibonacci(n-2));
        }
    }
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms in series : ");
        n = sc.nextInt();
        sc.close();
        
        System.out.println("Fibonacci Series : ");
        for ( i=0; i<n; i++) 
        {
            System.out.print(fibonacci(i)+" ");    
        }
        
    }
}
