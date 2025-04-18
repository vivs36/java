import java.util.*;
class Armstrong
{
    int n,sum;
    Armstrong(int num)
    {
       n = num;
       sum=0;
       
    }
    void calculate()
    {
        int d,temp=n;
        while(temp>0)
        {
            d = temp%10;
            sum = sum+(int)Math.pow(d,3);
            temp = temp/10;
            
        }
        
    }
    void display()
    {
        
        if(sum==n)
        
            System.out.print("It is an Armstrong number");
            
        
        else 
            System.out.print("It is not an Armstrong number"); 
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();
        Armstrong obj = new Armstrong(no);
        obj.calculate();
        obj.display();
                System.out.println();
    }
}
