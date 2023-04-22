// 25)  WAP to check weather number is present in array or not (using recursion only) and the 
// function’s syntax is given below
// Int isInArray(int a[],int m); 
// Where int a[] is Array of integer and m is element to be searched. 
import java.util.Scanner;

public class P25 
{
    int isInArray(int a[], int m )
    {
        // base case
        if(a.length <= 0)
            return -1;
        // create new array
        int[] b = new int[a.length-1];
        
        for(int i=1; i<a.length; i++)
        {
            b[i-1]=a[i];
        }
        // recursive call
        int n = isInArray(b, m);

        if(n>=0)
            return n+1;
        else if(a[0]==m)
            return 0;
        else
            return -1;
    }
    public static void main(String[] args) 
    {
        int n,m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter element at a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to be search : ");
        m = sc.nextInt();

        sc.close();
        P25 obj = new P25();
        System.out.println(obj.isInArray(a, m));
    }
}
