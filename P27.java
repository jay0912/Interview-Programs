//27) WAP to sort an Array using Counting sort. 
import java.util.Scanner;

public class P27 
{
    static int getMax(int A[])
    {
        int max = 0; 

        for(int i=0; i<A.length; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }

        return max;
    }
    static void counting_sort(int A[], int n)
    {
        int max;
        max = getMax(A);
        int[] B = new int[n+1]; 
        int[] C = new int[max+1];

        for(int i=0; i<=max; i++)
        {
            C[i] = 0;    
        }

        for(int j=0; j<n; j++)
        {
            C[A[j]]++;
        }

        for(int i=1; i<=max; i++)
        {
            C[i] = C[i] + C[i-1];
        }

        for(int j=n-1; j>=0; j--)
        {
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }

        // for(int i=0; i<n; i++)
        // {
        //     A[i] = B[i];    
        // }

        System.out.println();
        System.out.println("Sorted Array:");
        for(int i=0; i<B.length; i++)
        {
            System.out.print(B[i]+" ");
        }

    }

    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter size of Array : ");
        n = sc.nextInt();

        int [] A = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element at A["+i+"] : ");
            A[i] = sc.nextInt();
        }
        sc.close();

        counting_sort(A, n);
    }
}
