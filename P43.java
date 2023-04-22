// Given an array of N integers, and an integer K, find the number of pairs of elements in the 
// array whose sum is equal to K.
// e.g. 
// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.
 import java.util.Scanner;

public class P43 
{
    public static void main(String[] args) 
    {
        int n, k, pairs=0;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the Size of the Array : ");
        n =sc.nextInt();

        System.out.print("Enter the value of K : ");
        k = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("\n Enter the Elements of Array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter ELement At arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i] + arr[j] == k)
                {
                    pairs++;
                }
            }
        }

         System.out.println("\n Total number of Pairs whose sum is equal to "+k+" is : "+(pairs/2));
    }    
}
