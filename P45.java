//P45) WAP to convert a hexa-decimal to Octal.

import java.util.Scanner;

public class P45 
{
    static void DeciToOct(int num)
    {
        int index=0;
        int octal[] = new int[50];
        int temp = num;

        while(temp > 0)
        {
            octal[index++] = temp%8;
            temp = temp/8;
        }

        System.out.print("Octal Number is : ");
        for (int j = index-1; j >= 0; j--) 
        {
            System.out.print(octal[j]);
        }
    }

    static void HexToDec(String hex)
    {
        int len = hex.length();
        int base =  1;
        int deci = 0;

        for(int i=len-1; i>=0; i--)
        {
            if(hex.charAt(i) >= '0' && hex.charAt(i) <= '9')
            {
                deci += (hex.charAt(i) - 48)*base;
                base = base*16; //n*16^power++
            }
            else if(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
            {
                deci += (hex.charAt(i) - 55)*base;
                base = base*16; //n*16^power++
            }
        }
        
        DeciToOct(deci);

    }

    public static void main(String[] args) 
    {
        String hex;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number in HexaDecimal : ");
        hex = sc.next();

        HexToDec(hex);     
    }    
}
