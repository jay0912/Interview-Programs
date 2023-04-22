// 35) Given two integer arrays nums1 and nums2, return an array of their intersection. Each 
// element in the result must appear as many times as it shows in both arrays and you may 
// return the result in sorted order.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P35 
{
    public static void main(String[] args) 
    {
        int size1, size2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the 1st array : ");
        size1 = sc.nextInt();

        System.out.print("Enter the length of the 2nd array : ");
        size2 = sc.nextInt();

        int[] num1 = new int[size1];
        int[] num2 = new int[size2];

        System.out.println("\nEnter the Element of the 1st Array : ");
        for(int i=0; i<size1; i++)
        {
            System.out.print("Enter Element at num1["+i+"] : ");
            num1[i] = sc.nextInt();
        }

        System.out.println("\nEnter the Element of the 2nd Array : ");
        for(int i=0; i<size1; i++)
        {
            System.out.print("Enter Element at num2["+i+"] : ");
            num2[i] = sc.nextInt();
        }

        sc.close();

        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(num1);
        Arrays.sort(num2);

        for(int i=0,j=0; i<num1.length && j < num2.length;)
        {
            if(num1[i] < num2[j])
            {
                i++;
            }
            else if(num1[i]==num2[j])
            {
                result.add(num1[i]);
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        System.out.println("\nIntersection Set : ");
       
            System.out.print(result);
       
        

    }
    
}



   