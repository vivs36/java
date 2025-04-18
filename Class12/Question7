/*Circular Prime Number (using functions). Eg: - 13 – reverse – 31 both are prime number
hence it is a Circular Prime number.*/
import java.util.Scanner;
class Circular_Prime
{
    int num,rev;
    Circular_Prime()
    {
        num=0;
        rev=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
    }
    void reverse()
    {
        int temp=num;
        rev=0;
        while(temp>0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
    }
    boolean is_prime(int n)
    {
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    void display()
    {
        if(is_prime(num) && is_prime(rev))
        System.out.println(num+" is a Circular Prime Number");
        else 
        System.out.println(num+" is not a Circular Prime Number");
    }
    public static void main(String args[])
    {
        Circular_Prime obj=new Circular_Prime();
        obj.accept();
        obj.display();
                System.out.println();
    }
}