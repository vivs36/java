/*14. Counting vowels in a string and printing.*/
import java.util.*;
class CountVowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        char ch;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
           ch=Character.toLowerCase(s.charAt(i));
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
             c++;
        }
        System.out.println("Number of Vowels in the the Sentence: "+c);
    }
}