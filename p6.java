// 6) Print a following pattern 
// 1
// 1 2
// 1 2 3
// 1 2 3 4
import java.util.Scanner;

public class p6 
{
    public static void main(String[] args) 
    {
        int n,i,j;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }    
}
