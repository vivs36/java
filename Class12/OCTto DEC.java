import java.util.Scanner;
class OCTtoDEC
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("M = ");
        int m = sc.nextInt();

        System.out.print("N = ");
        int n = sc.nextInt();

        if ((m <= 0 || m >= 10) || (n <= 2 || n >= 6))
        {
            System.out.println("Values not in range");
            return;
        }

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            System.out.println("ENTER ELEMENTS FOR ROW " + (i + 1) + ":");
            for (int j = 0; j < n; j++)
            {
                int val = sc.nextInt();
                if (val < 0 || val > 7)
                {
                    System.out.println("Invalid octal digit. Must be between 0 and 7.");
                    return;
                }
                a[i][j] = val;
            }
        }

        System.out.println("FILLED MATRIX    DECIMAL EQUIVALENT");
        for (int i = 0; i < m; i++)
        {
            int decimal = 0;
            for (int j = 0; j < n; j++)
            {
                decimal += a[i][j] * Math.pow(8, n - 1 - j);
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\t           "+decimal);
        }
        System.out.println();
    }
}