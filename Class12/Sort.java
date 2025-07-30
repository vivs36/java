import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        if(n <= 2 || n >= 10)
        {
            System.out.println("Size not in range");
            return;
        }

        int a[] = new int[n];
        int b[][] = new int[n][n];

        System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY:");
        for (int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            if (val < 0)
            {
                System.out.println("Only positive integers allowed.");
                return;
            }
            a[i] = val;
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.print("SORTED ARRAY: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0)
                    b[i][j] = a[j];
                else if (j < n - i)
                    b[i][j] = a[j];
                else
                    b[i][j] = a[n - i - 1];
            }
        }

        System.out.println("FILLED MATRIX:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
