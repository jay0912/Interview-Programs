// 40)Given an array nums with n integers, your task is to check if it could become non-decreasing 
// by modifying at most one 
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
import  java.util.Scanner;

public class P40 
{
    public static void main(String[] args) 
    {
        int size,count=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("\nEnter the Element of the Array : ");
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter Element at a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        for(int i=0; i<size-1; i++)
        {
            if(a[i] > a[i+1])
            {
                count++;
            }
        }

        if(count>1)
        {
            System.out.print("\nFalse");
        }
        else
        {
            System.out.print("\nTrue");
        }
        
    }
}
