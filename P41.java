// 41) You are given an integer num. Rearrange the digits of num such that its value is minimized 
// and it does not contain any leading zeros.
// Return the rearranged number with minimal value.
// Note that the sign of the number does not change after rearranging the digits.
// Input: num = 310
// Output: 103
// Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 
// 310. 
// The arrangement with the smallest value that does not contain any leading zeros is 103.

import java.util.Scanner;
import java.util.Arrays;

public class P41
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();

        String str = Integer.toString(n);
        int size= str.length();


        int[] arr = new int[size];
        int  i = 0;
        int temp = n;

        while(temp!=0)
        {
            int reminder = temp%10;
            arr[i] = reminder;
            i++;
            temp/=10;
        }

        Arrays.sort(arr);


        for(int j=0; j<arr.length; j++)
        {
            if(arr[0] == 0)
            {
                if(arr[0] < arr[j])
                {
                    int t = arr[0];
                    arr[0] = arr[j];
                    arr[j] = t;
                    break;
                }
            }
        }

        System.out.print("\nRearrange of "+n+" is : ");
        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j]);
        }



    }
}
