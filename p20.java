//20)  WAP to find a power a^b (without using power and multiplication operation). 
import java.util.Scanner;

public class p20 
{
    static int power(int a, int b)
    {
        int sum = 0;
        while(b>0)
        {
            sum += a;
            b--;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int n,pow;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        System.out.print("Enter Power : ");
        pow = sc.nextInt();
        sc.close();

        int ans = 1;
        while (pow > 0) 
        {
            ans = power(ans, n);
            pow--;
        }

        System.out.println("Power of "+n+" is : "+ans);
        
    }
}
