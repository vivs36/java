import java.util.*;

public class PalinSent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        if (sentence.length() < 2)
        {
            System.out.println("INVALID INPUT");
            return;
        }

        char lastChar = sentence.charAt(sentence.length() - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!')
        {
            System.out.println("INVALID INPUT");
            return;
        }

        String body = sentence.substring(0, sentence.length() - 1);

        if (!body.equals(body.toUpperCase()))
        {
            System.out.println("INVALID INPUT");
            return;
        }

        if (body.contains("  "))
        {
            System.out.println("INVALID INPUT");
            return;
        }

        StringTokenizer st = new StringTokenizer(body);
        ArrayList<String> convertedWords = new ArrayList<String>();
  
        while (st.hasMoreTokens())
        {
            String word = st.nextToken();
            if (isPalindrome(word))
            {
                convertedWords.add(word);
            }
            else
            {
                convertedWords.add(makePalindrome(word));
            }
        }

        System.out.println(sentence);
        for (String w : convertedWords)
        {
            System.out.print(w + " ");
        }
        System.out.println();
    }

    static boolean isPalindrome(String word)
    {
        int i = 0, j = word.length() - 1;
        while (i < j)
        {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static String makePalindrome(String word)
    {
        StringBuilder sb = new StringBuilder(word.substring(0, word.length() - 1));
        sb.reverse();
        if (word.charAt(word.length() - 1) == sb.charAt(0))
        {
            sb.deleteCharAt(0);
        }
        return word + sb.toString();
    }
}
