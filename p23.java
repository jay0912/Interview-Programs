//23) WAP to enter an element at specific position into array. (Do not take a new array)
import java.util.Scanner;

public class p23 
{
    public static void main(String[] args) 
    {
        int n,x,pos,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the Array : ");
        n = sc.nextInt();

        int[] a = new int[n+1];

        for(i=0; i<n; i++)
        {   
            System.out.print("Enter element at a["+(i)+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nOld Array :");
        for(i=0; i<a.length-1; i++)
        {
            System.out.print(a[i]+" ");
        }
        

        System.out.print("\n\nEnter specified position : ");
        pos = sc.nextInt();
        System.out.print("Enter specified element to be insert : ");
        x = sc.nextInt();

        for(i=(n-1); i>=(pos-1); i--)
        {   
            a[i+1] = a[i];
        }
        a[pos-1]=x;

        System.out.println("\nNew Array :");
        for(i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
        

        
        
    }    
}
