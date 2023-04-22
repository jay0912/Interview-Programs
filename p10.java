// 10)  WAP to find a prime number between range (range should be entered by user).
import java.util.Scanner;

public class p10 
{
    public static void main(String[] args) 
    {
        int n1,n2,i,j,flag;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Starting Range : ");
        n1 = sc.nextInt();
        System.out.print("Enter Ending Range : ");
        n2 = sc.nextInt();

        sc.close();


        System.out.print("\nPrime Numbers between "+n1+" & "+n2+" is :: ");
        for(i=n1; i<=n2; i++)
        {
            if(i==0 || i==1)
            {
                continue;
            }

            flag = 1;

            for(j=2; j<=i/2; ++j)
            {
                if(i%j == 0)
                {
                    flag = 0;
                }
            }

            if(flag==1)
            {
                System.out.print(i+" ");
            }
        }
    }    
}
