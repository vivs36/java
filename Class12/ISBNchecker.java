import java.util.Scanner;
public class ISBNchecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10-digit ISBN: ");
        String isbn = sc.next();
        int sum = 0;

        if (isbn.length() != 10)
        {
            System.out.println("Invalid ISBN length");
            return;
        }

        for (int i = 0; i < 10; i++)
        {
            char ch = isbn.charAt(i);
            int digit;

            if (i == 9 && (ch == 'X' || ch == 'x'))
                digit = 10;
            else if (Character.isDigit(ch))
                digit = Character.getNumericValue(ch);
            else
            {
                System.out.println("Invalid character in ISBN");
                return;
            }
            sum += digit * (10 - i);
        }

        if (sum % 11 == 0)
            System.out.println("Valid ISBN");
        else
            System.out.println("Invalid ISBN");
    }
}
