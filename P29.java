// 29)  WAP to find a quotient and reminder of 2 number (bigger number should be divided by 
// lower number) and you are not allowed to use a division and quotient operator.


import java.util.Scanner;

public class P29
{
    public static void main(String[] args) 
    {
        int num;
        int divider;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to divide : ");
        num = sc.nextInt();
        System.out.print("Enter Divider : ");
        divider = sc.nextInt();
              
        int temp;
        temp = num;

        while(temp >= divider)
        {
            temp = temp - divider;
            counter++;
        }

        System.out.println();
        System.out.println("The Dividion : "+num+"/"+divider);
        System.out.println();
        System.out.println("The Quotient : "+temp);
        System.out.println("The Reminder : "+counter);

    }
}


