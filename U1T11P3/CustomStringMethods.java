package U1T11P3;

public class CustomStringMethods {
     public CustomStringMethods () {}

     public boolean longerThan (String myString, int maxLength) {
        return myString.length() > maxLength;
     }

     public String funnyString (String str, int indx) {
        String letter = str.substring(indx, indx +1); 
        return letter + str + letter; 
     }

      public String halvesReversed(String myString) {
        int halfLen = myString.length() / 2;
        String firstHalf = myString.substring(0, halfLen); 
        String secondHalf = myString.substring(halfLen); 
        return secondHalf + firstHalf; 
     }

      public String pigLatin(String orig) {
        String letter = orig.substring(0,1); 
        return orig.substring(1) + letter + "ay";        
     }

}


