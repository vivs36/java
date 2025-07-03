/*Program to arrange the array elements in descending order using Insertion sort and print
the original matrix, sorted array elements and the Transpose of sorted array elements in the
matrix form*/
import java.util.Scanner;
public class Insertion_Transpose
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
        
        int n=b.length;
        for(int i=0;i<n;i++)
        {
            int key=b[i];
            int j=i-1;
            while(j>=0 && b[j]<key)
            {
                b[j+1]=b[j];
                j=j-1;
            }
            b[j+1]=key;
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
        
        // Printing the transpose of the sorted matrix
        System.out.println("Transpose of Sorted Matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j<c;j++) 
            {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }
}