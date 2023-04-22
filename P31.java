//31) WAP to sort an Array using shell sort.
import java.util.Scanner;

public class P31 
{
    public static void shellSort(int arr[])
    {
        int n = arr.length;

        for(int gap=n/2; gap>0; gap/=2)
        {
            for(int j=gap; j<n; j++)
            {
                for(int i=j-gap; i>=0; i-=gap) //i-=gap is for to compare pervious gapped element
                {
                    if(arr[i+gap] > arr[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
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

        shellSort(arr);

        System.out.println("\nSorted ARRAY : ");
        for(int  i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
