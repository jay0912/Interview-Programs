//5.2) WAP to find a summation of a digit of a given number. (Recursive).
import java.util.Scanner;

public class p5_2 
{
    static int sum(int n)
    {
        if(n>0)
        {
            return (n%10 + sum(n/10));
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) 
    {
        int n,result;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Digit : ");
        n = sc.nextInt();
        
        sc.close();

        result = sum(n);

        System.out.println("The summation of "+n+" is : "+result);
    }
    
}
