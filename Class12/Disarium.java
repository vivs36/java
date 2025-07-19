class Disarium 
{
    int num;
    int size;
    Disarium( int nn )
    {
        num = nn;
        size = 0;
    }
    
    void countDigit()
    {
        int c = 0;
        int temp = num;
        while(temp!=0)
        {
            temp = temp / 10;
            c++;
        }
        size = c;
    }
    
    int sumofDigits( int n , int p )
    {
        if (n == 0)
            return 0;
        int digit = n % 10;
        return sumofDigits(n / 10, p - 1) + (int)Math.pow(digit, p);
    }
    
    void check() 
    {
        countDigit(); 
        int sum = sumofDigits(num, size); 
        if (sum == num) 
            System.out.println(num + " is a Disarium number");
         else 
            System.out.println(num + " is NOT a Disarium number");
    }
}