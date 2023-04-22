// 54)You  have  n  super  washing  machines  on  a  line.  Initially,  each  washing  machine  has  some 
// dresses or is empty. 
// For each move, you could choose any m (1 <= m <= n) washing machines, and pass one dress 
// of each washing machine to one of its adjacent washing machines at the same time. 
// Given an integer array machine representing the number of dresses in each washing machine 
// from left to right on the line, return the minimum number of moves to make all the washing 
// machines have the same number of dresses. If it is not possible to do it, return -1. 
// Input: machines = [1,0,5] 
// Output: 3 
// Explanation: 
// 1st move:    1     0 <-- 5    =>    1     1     4 
// 2nd move:    1 <-- 1 <-- 4    =>    2     1     3 
// 3rd move:    2     1 <-- 3    =>    2     2     2 
import java.util.Scanner;

public class P54
{
    public static int count(int[] machine ,int sum, int n)
    {
        int clothes = sum/n;
        int move = 0;

        if(sum%n!=0)
        {
            return -1;
        }
        else
        {
            for (int i = 0; i < n; i++)
            {
                while(machine[i] < clothes)
                {
                    machine[i] = machine[i] + 1;
                    move++;
                }
                // else
                // {
                //     machine[i] = machine[i] - 1;
                // }    
            }
            return move;
        }

    }

    public static void main(String[] args) 
    {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the no. of Washing Machines : ");
        n = sc.nextInt();

        int[] machine = new int[n];

        System.out.print("\nEnter Clothes :\n ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter no. of clothes of "+(i+1)+"'s Machine : ");
            machine[i] = sc.nextInt();
            sum = sum + machine[i];
        }
        sc.close();

        int moves = count(machine,sum,n);

        System.out.print("\nNumbers of Move : "+moves);

    }
}