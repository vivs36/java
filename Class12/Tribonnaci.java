/*Tribonnaci series till nth number (using functions). Eg:- 0 1 2 3 6 11………n*/
import java.util.*;
class Tribonnaci
{
    int n;
    Tribonnaci()
    {
        n=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of terms");
        n=sc.nextInt();
    }
    void generate()
    {
        int a=0,b=1,c=2,d;
        if(n>=1)
        System.out.print(a+" ");
        if(n>=2)
        System.out.print(b+" ");
        if(n>=3)
        System.out.print(c+" ");
        for(int i=4;i<=n;i++)
        {
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
    
    public static void main(String args[])
    {
        Tribonnaci obj=new Tribonnaci();
        obj.accept();
        obj.generate();
    }
}