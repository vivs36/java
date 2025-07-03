import java.util.*;
class Smith
{
    boolean comp(int n)    //function to check if the number is composite or not
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>2)
            return true;
        else
            return false;
    }
    int Digit(int n)       //function to calculate sum of digit of the number
    {
        int rev,s=0;
        while(n>0)
        {
            rev = n%10;
            s=s+rev;
            n=n/10;
        }
        return s;
    }
    int Primefactor(int n)//function to calculate the sum of prime factorization
    {
        int i=2,sum=0;
        while(n>1)
        {
            if(n%i==0)
            {   
            sum=sum+Digit(i);
                n=n/i;
            }
            else
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Smith obj = new Smith();
        Scanner in = new Scanner(System.in);
        int n,x,y;
        System.out.println("Enter Number");
        n= in.nextInt();
        if(obj.comp(n)==true)
        {
            x= obj.Digit(n);                //storing sum of digits of the number
            y= obj.Primefactor(n);         //storing sum of prime factors of the number
            if(x==y)
            System.out.println("It is a Smith Number : "+n);
            else
            System.out.println("It is not a Smith Number : "+n);
                    System.out.println();
        }
    }
}