class SeriesSum
{
    int x,n;
    double sum;
    SeriesSum(int xx , int nn)
    {
        x=xx;
        n=nn;
        sum=0;
    }
    double findfact(int m)
    {
        if(m<=1)
            return 1;
        else
            return m * findfact(m-1);
    }
    void calculate()
    {
        for(int i=1;i<=n;i++)
        {
            int power=2*i;
            int fact=2*i-1;
            sum += Math.pow(x,power)/findfact(fact);
        }
    }
    void display()
    {
        System.out.println("Sum of the series = "+sum);
    }
}
    