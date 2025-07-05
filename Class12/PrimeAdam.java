import java.util.Scanner;
class PrimeAdam
{
    static boolean prime(int a)
    {
        for(int i = 2; i <= (a / 2); i++)
        
            if(a % i == 0)
                return false;
        
        return true;
    }

    static int reverse(int a)
    {
        int rev = 0;
        while(a != 0)
        {
            rev = rev * 10 + a % 10;
            a = a / 10;
        }
        return rev;
    }

    static boolean adam(int a)
    {
        return reverse(a * a) == (reverse(a) * reverse(a));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m =");
        int m = sc.nextInt();
        System.out.print("n =");
        int n = sc.nextInt();
        
        if (m > n)
        {
            System.out.println("INVALID INPUT");
            return;
        }

        int count = 0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");

        for(int i = m; i <= n; i++)
        {
            if(prime(i) && adam(i))
            {
                System.out.print(i + " ");
                count++;
            }
        }

        if(count == 0)
            System.out.print("NIL");

        System.out.println();
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}
