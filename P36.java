//36) WAP to sort an Array using Merge sort. 

import java.util.Scanner;

public class P36 
{

    public static void conquer(int arr[], int low, int mid, int high)
    {
        int[] merged = new int[high - low + 1]; // n-1 - 0 + 1

        int index1 = low; //0
        int index2 = mid+1; // middle element +1

        int i = 0;

        while( index1 <= mid && index2 <= high)
        {
            if(arr[index1] <= arr[index2])
            {
                merged[i++] = arr[index1++];
            }
            else
            {
                merged[i++] = arr[index2++];
            }
        }

        while(index1 <= mid)
        {
            merged[i++] = arr[index1++]; //baki bachela sorted element hoi e 
        }

        while(index2 <= high)
        {
            merged[i++] = arr[index2++];
        }

        for( int k=0, j=low; k<merged.length; k++,j++)
        {
            arr[j] = merged[k];
        }

    }

    public static void divide(int arr[], int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int mid = low + (high-low) / 2; // space complexity create na thai etle 

        divide(arr, low, mid);   // part 1
        divide(arr, mid+1, high); // part 2

        conquer(arr, low, mid, high); // combine 
    }

    public static void main(String[] args) 
    {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the Element of the Array : ");
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter Element at a["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        int n = arr.length;

        divide(arr, 0, n-1);

        System.out.println("\nSorted ARRAY : ");
        for(int  i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
