package U1T11;
import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print ("Enter first string: "); 
        String word1 = scan.nextLine(); 
        System.out.print ("Enter second string: "); 
        String word2 = scan.nextLine(); 

        if (word1.length() > word2.length()) {
            System.out.println (word1 + " is longer"); 
        } else {
            System.out.println (word2 + " is longer"); 
        }
        
        int halfLen1 = (int) ((word1.length() / 2) + 0.5); 
        System.out.println ("First half: " + word1.substring(0, halfLen1)); 
        System.out.println ("Second half: " + word1.substring(halfLen1)); 

        int halfLen2 = (int) ((word2.length() / 2) + 0.5); 
        System.out.println ("First half: " + word2.substring(0, halfLen2)); 
        System.out.println ("Second half: " + word2.substring(halfLen2)); 

        if (word1.indexOf(word2) == -1) { 
            System.out.println (word2 + " is not apart of " + word1); 
        } else {
            System.out.println (word2 + " is found in " + word1 + " at idex of " + word1.indexOf(word2));   
        }

        scan.close();        
    }
    
}