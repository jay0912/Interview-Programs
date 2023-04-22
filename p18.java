//18)  WAP to sort an Array using Selection sort. 
import java.util.Scanner;

public class p18 
{
    static void selectionSort(int a[])
    {
        int n = a.length;
        int i,j,minj,minx;

        for(i=0; i<n-1; i++)
        {
            minj = i;
            minx = a[i];

            for(j=i+1; j<n; j++)
            {
                if(a[j] < minx)
                {
                    minj = j;
                    minx = a[j];
                }
            }

            a[minj] = a[i];
            a[i] = minx;
        }


        //print sorted array
        System.out.println("\nAfter SELECTION SORT :");
        for(i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

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
        
        selectionSort(a);
    }
}
