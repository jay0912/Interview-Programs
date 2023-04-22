// 42)WAP to implement a sliding window problem. You are given an array of integers nums, 
// there is a sliding window of size k which is moving from the very left of the array to the 
// very right. You can only see the k numbers in the window. Each time the sliding window 
// moves right by one position.
// Input: nums = [1,3, -1, -3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
import java.util.Scanner;

public class P42 
{
    public static void main(String[] args) 
    {
        int n,k;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of the Array : ");
        n = sc.nextInt();
        System.out.print("Enter K : ");
        k = sc.nextInt();

        int[] arr = new int[n];
        int[] Ans = new int[n-k+1];

        System.out.println("\nEnter the Element of the Array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter Element at a["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        
        for(int i=0; i<n-k+1; i++)
        {
            
            int max = arr[i];
            for(int j=i; j<i+k; j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                }

            }
            Ans[i] = max;
        }

        System.out.println("\nMaximum Array : ");
        for(int i=0; i<Ans.length; i++)
        {
            System.out.print(Ans[i]+" ");
        }

    }
}
