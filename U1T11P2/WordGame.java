package U1T11P2;
import java.util.Scanner; 

public class WordGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

            int score = 0; 
            int words = 1; 

            System.out.print ("Enter first word: "); 
            String previousWord = scan.nextLine(); 

            while (score < 50) {
                System.out.print ("Enter next word: "); 
                String enterredWord = scan.nextLine(); 
                words ++; 

                if (enterredWord.compareTo(previousWord) > 0) {
                    score += 2; 
                    System.out.println ("+2 points, " + enterredWord + " comes after " + previousWord); 
                    System.out.println ("Score: " + score); 
                    System.out.println (); 
                } else if (enterredWord.compareTo(previousWord) < 0) {
                    score -= 5; 
                    System.out.println ("-5 points, " + enterredWord + " comes before " + previousWord); 
                    System.out.println ("Score: " + score); 
                    System.out.println (); 
                }             

                if (enterredWord.equals(previousWord)) {
                    score -= 10; 
                    System.out.println ("-10 points, " + enterredWord + " and " + previousWord + " are equal"); 
                    System.out.println ("Score: " + score); 
                    System.out.println (); 
                }

                String lastLetters = previousWord.substring(previousWord.length() - 2); 
                String firstLetters = enterredWord.substring(0,2); 

                if (lastLetters.equals(firstLetters)) {
                    score += 5; 
                    System.out.println ("+5 points, the last two letters of " + previousWord + " (" + lastLetters + ") and the first two letters of " + enterredWord + " (" + firstLetters + ") are equal" ); 
                    System.out.println ("Score: " + score); 
                    System.out.println (); 
                }

                String letter1 = previousWord.substring(0,1); 
                if (enterredWord.indexOf(letter1) != -1) {
                    score += 3; 
                    System.out.println ("+ 3 points, the first letter " + letter1 + " is found in " + enterredWord); 
                    System.out.println ("Score: " + score); 
                    System.out.println (); 

                }
                previousWord = enterredWord; 
                
            }

            System.out.println ("You have won!"); 
            System.out.println ("Total words: " + words); 
            System.out.println ("Score: " + score); 

         scan.close(); 
    }
}
