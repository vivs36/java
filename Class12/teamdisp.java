import java.util.*;
class teamdisp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Teams");
        int n = sc.nextInt();
        if(n < 3 || n > 8)
        {
            System.out.println("Invalid number of teams");
            return;
        }
        sc.nextLine();
        String teams[] = new String[n];
        System.out.println("Enter Teams Names");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Team " + (i+1) + " = ");
            teams[i] = sc.nextLine();
        }
        
        int maxLen = 0;
        for(int i = 0; i < n; i++)
            if(teams[i].length() > maxLen)
                maxLen = teams[i].length();
        
        for(int row = 0; row < maxLen; row++)
        {
            for(int col = 0; col < n; col++)
            {
                if(row < teams[col].length())
                    System.out.print(teams[col].charAt(row));
                else
                    System.out.print(" ");
                System.out.print("        "); // 8 spaces
            }
            System.out.println();
        }
    }
}
