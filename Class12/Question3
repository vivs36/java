/*Program to arrange the array elements in 90 Degrees rotation of a matrix and print the
original matrix and the rearranged matrix. */
import java.util.Scanner;
public class Rotate90
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);               // Taking matrix input
        System.out.print("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][]= new int[r][c];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++)  
        {
            for (int j = 0; j<c; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("90 Degree Rotated Matrix:");  
        for (int j = 0; j<c;j++)                  //transposing and mirroring at same time
        {
            for (int i = r-1; i >= 0; i--) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}