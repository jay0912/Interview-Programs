//32)WAP to sort an Array using Quick sort. 
import java.util.Scanner;

public class P32 
{
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1; //i -1

        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++; //i -1 mathi 0 kre

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++; // put pivot into pivot position from high
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;//pivot index
    }

    public static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
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
        sc.close();
        int n = arr.length;
        
        quickSort(arr ,0, n-1);

        System.out.println();
        System.out.println("Sorted ARRAY : ");
        for(int  i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
