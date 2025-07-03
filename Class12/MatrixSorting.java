/*Program to arrange the array elements in ascending order using Selection sort and print the
original matrix, sorted array elements and the Mirror image of sorted array elements in the
matrix form*/
import java.util.Scanner;
public class MatrixSorting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);               // Taking matrix input
        System.out.print("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][]= new int[r][c];
        int b[]= new int[r*c]; // 1D array
        int index = 0;

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = sc.nextInt();
                b[index++] = a[i][j]; // Convert 2D to 1D
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

        // Sorting the 1D array
        int n = b.length;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (b[j] < b[min])
                {
                    min = j;
                }
            }
            // Swap elements
            int temp = b[min];
            b[min] = b[i];
            b[i] = temp;
        }

        // Converting the sorted 1D array back to 2D matrix
        index = 0;
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                a[i][j] = b[index++];
            }
        }

        // Printing the sorted matrix
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Printing the mirror image of the sorted matrix
        System.out.println("Mirror Image of Sorted Matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = c - 1; j >= 0; j--) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
