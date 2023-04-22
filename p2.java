//2) WAP to find whether string is palindrome or not.
import java.util.Scanner;

public class p2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        sc.close();

        if(isPalindrome(str))
        {
            System.out.println("\nGiven string "+str+" is Palindrom.");
        }
        else
        {
            System.out.println("\nGiven string "+str+" is not Palindrom.");
        }
    }

    public static boolean isPalindrome(String str)
    {
        int left = 0, right = str.length()-1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
