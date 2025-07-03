/*Program to arrange the Boundary Elements of a matrix in ascending order using bubble
sort and print the original matrix, the rearranged boundary elements in matrix form and
the addition of all the boundary elements.*/
import java.util.Scanner;
public class BoundarySort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);               // Taking matrix input
        System.out.print("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int a[][]= new int[r][c];
        int b[]=new int[2*(r+c)-4]; // 1D array
        int index = 0;
        int sum=0;
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = sc.nextInt();
                if(i==r-1 || i==0 || j==0 || j==c-1)
                {
                b[index++] = a[i][j];  //Boundary elements
                sum=sum+a[i][j];
                }   
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
        
        
        int n = b.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < (n-i-1) ; j++) 
            {
                if (b[j] > b[j+1])
                {
                 // Swap elements
                 int temp = b[j];
                 b[j] = b[j+1];
                 b[j+1] = temp;
                }
            }
        }
        
        index=0;
        for (int i = 0; i < r; i++) 
        {    
            for (int j = 0; j < c; j++) 
            {
                if(i!=r-1 && i!=0 && j!=0 && j!=c-1)
                continue;
                else
                a[i][j]=b[index++];
            }
        }
        
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < r; i++)  
        {
            for (int j = 0; j<c; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of Boundary Elements: "+sum);
    }
}
