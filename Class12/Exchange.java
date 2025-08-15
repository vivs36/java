import java.util.*;
class Exchange
{
    String sent,rev;
    int size;
    Exchange()
    {
        sent = rev = "";
        size= 0 ;
    }
    void readsentence()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        sent = sc.nextLine();
    }
    void exfirstlast()
    {
        size = sent.length();
        char x,y;
        StringTokenizer st = new StringTokenizer(sent.substring(0,sent.length()-1)," ");
        while(st.hasMoreTokens())
        {
            String a = st.nextToken();
            x = a.charAt(0);
            y = a.charAt(a.length()-1);
            if(a.length()==1)
                rev+=a+" ";
            else if(a.length()==2)
                rev+=y+""+x+" ";
            else
                rev+=y+a.substring(1,a.length()-1)+x+" ";
        }
        rev=rev.trim()+".";
    }
    void display()
    {
        System.out.println();
        System.out.println("Original Sentence : "+sent);
        System.out.println("Reverse Sentence : "+rev);
    }
    public static void main(String args[])
    {
        Exchange obj = new Exchange();
        obj.readsentence();
        obj.exfirstlast();
        obj.display();
    }
}
