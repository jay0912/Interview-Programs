//63) You are climbing a staircase. It takes n steps to reach the top. Each time you can either 
// climb 1 or 2 steps. In how many distinct ways can you climb to the top?
import java.util.Scanner;

public class P64
{
    public static int fact(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) 
        {
            fact = fact * i;    
        }
        return fact;
    }

    public static void main(String[] args) 
    {
        int steps,sum=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Steps  : ");
        steps = sc.nextInt();
        sc.close();

        for (int r=0; r<=steps ; r++) 
        {
            sum = sum + fact(steps) / ((fact(steps-r)) * fact(r)); // ncr formula
            steps--;
            // where r is no of 2s
        }

        System.out.print("Possible Ways : "+sum);

    }
}