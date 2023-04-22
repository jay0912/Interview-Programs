//46) WAP to Convert a Decimal to Octal and Vice versa. 

import java.util.Scanner;

public class P46 
{

    public static void octToDec(int oct)
    {
        int i=0;
        int deci=0;

        while(oct != 0)
        {
            deci = (deci) + ((oct%10) * (int)(Math.pow(8,i)));
            i++;
            oct/=10;
        }

        System.out.println("Converted Decimal Number of is : "+deci);
    }

    //decimal to octal
    public static void decToOct(int num)
    {
        int index=0;
        int octal[] = new int[50];
        int temp = num;

        while(temp > 0)
        {
            octal[index++] = temp%8;
            temp = temp/8;
        }

        System.out.print("Octal of is : ");
        for (int j = index-1; j >= 0; j--) 
        {
            System.out.print(octal[j]);
        }
    }

    public static void main(String[] args) 
    {
        int num,oct;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number in Decimal : ");
        num = sc. nextInt();
        
        decToOct(num);

        System.out.print("\n\nEnter number in Octal : ");
        oct = sc. nextInt();

        octToDec(oct);

        sc.close();


    
    }
}
