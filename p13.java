//13) WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user).
import java.util.Scanner;

public class p13 
{
    public static void main(String[] args) 
    {
        int row1,col1,row2,col2,i,j,k;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix 1 : ");
        row1 = sc.nextInt();
        System.out.print("Enter number of columns for matrix 1 : ");
        col1 = sc.nextInt();
        int[][] a = new int[row1][col1];
        
        System.out.print("\nEnter number of rows for matrix 2 : ");
        row2 = sc.nextInt();
        System.out.print("Enter number of columns for matrix 2 : ");
        col2 = sc.nextInt();
        int[][] b = new int[row2][col2];

        //take matrix 1
        System.out.println("\nEnter Values for Matrix 1");
        for(i=0; i<row1; i++)
        {
            for(j=0; j<col1; j++)
            {
                System.out.print("Enter Element at a["+(i+1)+"]["+(j+1)+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        //take matrix 2
        System.out.println("\nEnter Values for Matrix 2");
        for(i=0; i<row2; i++)
        {
            for(j=0; j<col2; j++)
            {
                System.out.print("Enter Element at b["+(i+1)+"]["+(j+1)+"] : ");
                b[i][j] = sc.nextInt();
            }
        }  

        int[][] c = new int[row1][col2];

        //Multiplication
        for(i=0; i<row1; i++)
        {
            for(j=0; j<col2; j++)
            {
                for(k=0; k<row2; k++)
                {
                    c[i][j] += ( a[i][k] * b[k][j] ); 
                }
            }
        }

        //resultan matrix
        System.out.println("\nMultipilication Matrix : ");
        for(i=0; i<row1; i++)
        {
            for(j=0; j<col2; j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

        
        sc.close();
    }    
}
