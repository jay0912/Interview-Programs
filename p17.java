//17)  WAP to sort an Array using insertion sort.
import java.util.Scanner;

public class p17 
{
    //insertion sorting class
    static void insertionSort(int a[])
    {
        int i,j,x;
        int n = a.length;

        for(i=1; i<n; i++)
        {
            x = a[i];      //take sencond element
            j = i-1;       // indicate first index
            
            while(x<a[j] && j>=0)
            {
                a[j+1] = a[j];     //move element to the right
                j--;            // until j = -1
            }
            a[j+1] = x;      // place small value at first index
        }

        //print sorted array
        System.out.println("After INSERTION SORT :");
        for(i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }


    }

    //main class
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the Array : ");
        n = sc.nextInt();

        int[] a = new int[n];

        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter element at a["+(i)+"] : ");
            a[i] = sc.nextInt();
        }

        insertionSort(a);

        sc.close();
    }    
}
