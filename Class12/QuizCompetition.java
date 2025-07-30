import java.util.*;

class QuizCompetition
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of participants (N): ");
        int n = sc.nextInt();

        if (n <= 3 || n >= 11) 
        {
            System.out.println("N must be greater than 3 and less than 11.");
            return;
        }

        char[][] answers = new char[n][5]; // Answers of participants
        char[] key = new char[5];          // Correct answers
        int[] scores = new int[n];         // Scores of each participant

        System.out.println("Enter answers of each participant (one by one, each answer on a new line):");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Participant " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) 
            {
                answers[i][j] = sc.next().toUpperCase().charAt(0);
            }
        }

        System.out.println("Enter the answer key (one answer per line):");
        for (int i = 0; i < 5; i++) 
        {
            key[i] = sc.next().toUpperCase().charAt(0);
        }

        int maxScore = 0;

        // Score calculation
        for (int i = 0; i < n; i++) 
        {
            int score = 0;
            for (int j = 0; j < 5; j++) 
            {
                if (answers[i][j] == key[j]) 
                {
                    score++;
                }
            }
            scores[i] = score;
            if (score > maxScore) 
            {
                maxScore = score;
            }
        }

        // Display scores
        System.out.println("Scores:");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Participant " + (i + 1) + " = " + scores[i]);
        }

        // Display highest scorers
        System.out.print("Highest score: ");
        for (int i = 0; i < n; i++) 
        {
            if (scores[i] == maxScore) 
            {
                System.out.print("Participant " + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}
