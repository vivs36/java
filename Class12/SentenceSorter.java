import java.util.*;

public class SentenceSorter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int len = sentence.length();
        char lastChar = sentence.charAt(len - 1);

        if (lastChar != '.' && lastChar != '?' && lastChar != '!')
        {
            System.out.println("INVALID INPUT");
            return;
        }

        String original = sentence;
        sentence = sentence.substring(0, len - 1);

        StringTokenizer st = new StringTokenizer(sentence);
        int count = st.countTokens();
        String[] words = new String[count];

        int i = 0;
        while (st.hasMoreTokens())
        {
            words[i] = st.nextToken();
            i++;
        }

        for (i = 0; i < count - 1; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (words[i].length() > words[j].length())
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
                else if (words[i].length() == words[j].length())
                {
                    if (words[i].compareTo(words[j]) > 0)
                    {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }

        System.out.println(original);
        for (i = 0; i < count; i++)
        {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
    