/*15. Counting words starting with vowels.*/
import java.util.*;

class StartWithVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s);
        String a;
        char ch;
        int c = 0;

        System.out.println("Words Starting with Vowels: ");
        while (st.hasMoreTokens()) {
            a = st.nextToken();
            ch = Character.toLowerCase(a.charAt(0));  // Convert to lowercase to make it case-insensitive
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(a);
                c++;
            }
        }

        System.out.println("Number of Words Starting with Vowel: " + c);
    }
}
