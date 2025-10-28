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

      public String removeCharacter(String myString, int removeIdx) {
         if (removeIdx < 0 || removeIdx >= myString.length()) {
         return myString; 
       } 
        String newString = myString.substring(0, removeIdx) + myString.substring(removeIdx + 1); 
        return newString; 
     }

      public String insertAt(String orig, String insertText, String searchStr) {
        if (orig.indexOf(searchStr) == -1) {
         return orig + insertText; 
        }
        int index = orig.indexOf(searchStr); 
        return orig.substring(0, index) + insertText + orig.substring(index); 
     }
      
      public String endUp(String myString, int numToCap){
         if (numToCap >= myString.length()) {
           return myString.toUpperCase();
       }
        
         int len = myString.length() - numToCap;
         String half1 = myString.substring(0, len); 
         String half2 = myString.substring(len).toUpperCase(); 
         return half1 + half2; 
     } 
      public String yellOrWhisper (String myString) {
         String firstLetter = myString.substring(0,1); 
         if (firstLetter.equals(firstLetter.toUpperCase())) {
            return myString.toUpperCase(); 
         } else {
            return myString.toLowerCase(); 
         }
      }
 
}


