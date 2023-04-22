// 39)Given an array, rotate the array to the right by k steps, where k is non-negative.
// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 step to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
import java.util.Scanner;

public class P39 
{
    public static void main(String[] args) 
    {
        int n,k;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        System.out.print("Enter K steps : ");
        k = sc.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element at a["+i+"] : ");
            a[i] = sc.nextInt();
        }    


        for(int i=0; i<k-1; k--)
        {
            for(int j=0; j<n-1; j++)
            {
                int temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp;
            }
        }

        

        System.out.println("Resultant Array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        } 

    }    
}
