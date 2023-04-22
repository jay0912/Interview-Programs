//47)  WAP to Convert a Decimal to Hexa-decimal and vice versa
import java.util.Scanner;

public class P47 
{
    static void DecToHex(int dec)
    {
        int n = dec;
        int[] hexa = new int[50];
        int i = 0;

        while(n!=0)
        {
            hexa[i] = n%16;
            n/=16;
            i++;
        }

        System.out.print("HexaDecimal of "+dec+" is : ");
        for(int j=i-1; j>=0; j--)
        {
            if(hexa[j] > 9)
            {
                System.out.print((char)(55 + hexa[j]));
            }
            else
            {
                System.out.print(hexa[j]);
            }
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
        
        System.out.print("Decimal of "+hex+" is : "+deci);

    }


    public static void main(String[] args) 
    {
        int dec;
        String hex;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number in Decimal : ");
        dec = sc.nextInt();

        DecToHex(dec);

        System.out.print("\n\nEnter Number in HexaDecimal : ");
        hex = sc.next();

        HexToDec(hex);
    }
}
