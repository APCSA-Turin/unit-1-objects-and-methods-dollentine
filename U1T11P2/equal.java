package U1T11P2;
import java.util.Scanner; 

public class equal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print ("Enter string 1: "); 
        String str1 = scan.nextLine(); 
        System.out.print ("Enter string 2: "); 
        String str2 = scan.nextLine(); 

        if (str1.equals(str2)) {
            if ( str1.compareTo(str2)== 0) {
                System.out.println ("The strings are equal!"); 
            }
            
        } else if (str1.compareTo(str2) < 0) {
            System.out.println ("The strings are NOT equal!"); 
            System.out.println (str1 + " comes before " + str2 + " alphabetically"); 
        } else if (str1.compareTo (str2) > 0 ) {
            System.out.println ("The strings are NOT equal!"); 
            System.out.println (str1 + " comes after " + str2 + " alphabetically"); 
        }

        scan.close();
    }
}
