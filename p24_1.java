// 24)  WAP to delete an element from array specified by user. if element is not found print a 
// message “Element is not found” (do not take a new array).
import java.util.Scanner;

public class p24_1 
{
    public static void main(String[] args) 
    {
        int n,x,index=-1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Array : ");
        n = sc.nextInt();
        
        int[] a = new int[n];

        for(int i=0; i<a.length; i++)
        {   
            System.out.print("Enter element at a["+(i)+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nOld Array :");
        for(int j=0; j<a.length; j++)
        {
            System.out.print(a[j]+" ");
        }

        System.out.println("Enter Specifird Element to be delete : ");
        x = sc.nextInt();

        sc.close();

        
        for (int k=0; k<a.length; k++) 
        {
            if(x==a[k])
            {
                index = k;
                break;
            }    
        }

        if(index != -1)
        {
            for(int i=index; i<n-1; i--)
            {
                a[i] = a[i+1];
            }

            System.out.println("\nNew Array : ");
            for(int i=0; i<a.length-1; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            System.out.println("\n ELement "+x+" is not found in Array");
        }
    }    
}
