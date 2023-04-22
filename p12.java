// 12 ) WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value 
// should be taken from user (Note that you are not allowed to use an array for this)
import java.util.Scanner;

public class p12
{
  public static void main(String[] args) 
  {
    int num,n,sum=0, max=0, min=10;
    double avg;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter total numbers : ");
    num = sc.nextInt();

    for (int i = 0; i < num; i++) 
    {
      n = sc.nextInt();
      
      if(n>max)
        max = n;

      if(n<min && i==0)
        min = n;  

      sum = sum + n;  
    }    

    avg = sum / num ;

    System.out.println("\nTotal SUM : "+sum);
    System.out.println("AVERAGE : "+avg);
    System.out.println("MAX : "+max);
    System.out.println("MIN : "+min);
    System.out.println();
  }
}


