import java.util.*;

public class FiboString
{
    String x, y, z;
    int n;

    FiboString(String a,String b)
    {
        x = a;
        y = b;
        z = a+b;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
    }

    void generate()
    {
        if (n <= 0)
        {
            return;
        }
        if (n == 1)
        {
            System.out.println(x);
            return;
        }
        if (n == 2)
        {
            System.out.println(x);
            System.out.println(y);
            return;
        }

        System.out.println(x);
        System.out.println(y);

        String a = x;
        String b = y;

        for (int i = 3; i <= n; i++)
        {
            z = b + a;
            System.out.println(z);
            a = b;
            b = z;
        }
    }

    public static void main(String[] args)
    {
        FiboString fs = new FiboString("a","b");
        fs.accept();
        fs.generate();
    }
}
