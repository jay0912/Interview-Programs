//44) WAP to convert an Octal into hexa-decimal.

import java.util.Scanner;

public class P44 
{
    public static String hexaDecimal(int dec)
    {
        char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};
        int reminder;
        String hex="";

        while(dec!=0)
        {
            reminder = dec % 16;
            hex = a[reminder] + hex;
            dec/=16;
        }
        return hex;
    }

    public static void main(String[] args) 
    {
        int oct, dec=0, i=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Octal Number : ");
        oct = sc.nextInt();
        sc.close();

        while(oct!=0)
        {
            dec = dec + (oct%10)*(int)Math.pow(8,i);
            i++;
            oct/=10; 
        }
        
        String hexa = hexaDecimal(dec);
        System.out.println("HexaDecimal Number is : "+hexa);

    }     
}
