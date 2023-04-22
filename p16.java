//16) WAP to sort an Array using Bubble sort.
import java.util.Scanner;

public class p16 
{
    static void bubble_sort(int a[])
    {
        int i, j, temp=0; 

        for(i=0; i<a.length-1; i++)
        {
            for(j=0; j<a.length-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for(i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of array : ");
        n = sc.nextInt();

        int[] a = new int[n];

        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter element at a["+(i)+"] : ");
            a[i] = sc.nextInt();
        }

        sc.close();

        bubble_sort(a);
    }
}
