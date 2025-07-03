import java.util.*;

public class DiagonalSortSum 
   {
    public static void main(String[] args) 
       {
        Scanner sc = new Scanner(System.in);               // Input matrix size
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int a[][]= new int[n][n];
        int b[]=new int[(n%2==0) ? (2*n): (2*n-1)];
        int index=0;
        int sum=0;
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = sc.nextInt();
                if(i==j || (i+j==n-1) )
                {
                    b[index++]=a[i][j];
                    sum=sum+a[i][j];
                }
          }
        }  

        // Print original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        //sorting diagnol elements
        int x=b.length;
        for (int i = 0; i < x-1 ; i++) 
        {
            for (int j=0 ; j< (x-i-1) ; j++)
            {
                if (b[j] < b[j+1])
                {
                 // Swap elements
                 int temp = b[j];
                 b[j] = b[j+1];
                 b[j+1] = temp;
                }
            }
        }
        
        //converting 1d to 2d
        
        index=0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
               if(i==j || (i+j==n-1))
               a[i][j]=b[index++];
            }
        }
        
        // Print Sorted matrix
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of Diagnol Elements: "+sum);
    }
}
