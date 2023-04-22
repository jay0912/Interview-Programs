//15) WAP to convert a Decimal number to BCD. 
import java.util.Scanner;

public class p15 
{
    public static String toBCD(int num)
    {
        String BCD="";

        while(num!=0)
        {
            int t=num%10;
            String tBCD=Integer.toBinaryString(t);
        
            while(tBCD.length()<4)
            {
                tBCD="0"+tBCD;
            }

            BCD=tBCD+BCD;
            num/=10;
        }
        return BCD;
    }

    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to convert in BCD : ");
        n = sc.nextInt();
        sc.close();

        System.out.println("Decimal number "+n+" in BCD : "+toBCD(n));
    }    
}
