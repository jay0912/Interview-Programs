//5) WAP to find a summation of a digit of a given number. (Iterative)
import java.util.Scanner;

public class p5_1 
{
    public static void main(String[] args) 
    {
        int n,i,sum=0;
        int reminder;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();

        sc.close();
        
        for(i=0; i<n; i++)
        {
            reminder = n % 10;
            sum = sum + reminder;
            n = n / 10;
        }

        System.out.println("By iterative SUM is : "+sum);
    }    
}
