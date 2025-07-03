import java.util.*;
class Automorphic
{
    int n;
    Automorphic(int num)
    {
        n = num;
    }
    boolean calculate()
    {
        int c = 0, temp = n, sq;
        while (temp > 0)
        {
            temp = temp / 10;
            c++;
        }
        sq = n * n;
        if ((sq % (int)Math.pow(10, c)) == n)
            return true;
        else 
            return false;
    }

    void display()
    {
        if (calculate())
            System.out.println(n + " is an Automorphic number.");
        else       
            System.out.println(n + " is not an Automorphic number.");    
    } 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        Automorphic obj = new Automorphic(a);
        obj.display();
        System.out.println();
    }
}