/*13. In an array check for the words ending with vowels.*/
import java.util.*;
class End_Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Words");
        String a[]=new String[n];
        for (int i=0;i<n;i++)
           a[i]=sc.next();
        char ch;
        System.out.println();
        System.out.println("Words ending with vowels");
        for (int i=0;i<n;i++)
        {
            ch=a[i].charAt(a[i].length()-1);
            ch=Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.print(a[i]+" ");
        }
    }
}