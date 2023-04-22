//30)  WAP to convert a Decimal to Binary.
import java.util.Scanner;

public class P30
{
    public static void main(String[] args) 
    {
        int num, index=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number in Decimal : ");
        num = sc. nextInt();

        int binary[] = new int[50];
        int temp = num;

        while(temp > 0)
        {
            binary[index++] = temp%2;
            temp = temp/2;
        }

        System.out.print("Binary of "+num+" is : ");
        for (int j = index-1; j >= 0; j--) 
        {
            System.out.print(binary[j]);
        }

        

    }
} 