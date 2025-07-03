import java.util.*;
class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.print("Palindrome Words: ");
        while(st.hasMoreTokens())
        {
            String a=st.nextToken();
            String rev="";
            for(int i=a.length()-1 ; i>=0 ; i--)
            {
                rev=rev+""+a.charAt(i);
            }
            if(rev.equals(a))
            System.out.print(rev+" ");
        }
    }
}