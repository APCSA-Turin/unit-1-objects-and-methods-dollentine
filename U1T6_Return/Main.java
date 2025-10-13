package U1T6_Return;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.print ("What's your name? "); 
        String userName = scan.nextLine(); 
        System.out.print("How old are you? "); 
        int userAge = scan.nextInt(); 
        scan.nextLine(); 
        System.out.print("What's your favorite food? "); 
        String yourFavFood = scan.nextLine();
        System.out.print ("What is your weight in lbs? "); 
        Double userWeight = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.print ("Type in your first grade: ");
        double userGrade1 = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.print ("Type in your second grade: ");
        double userGrade2 = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.print ("Type in your final grade: ");
        double userGrade3 = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.print ("What time is it for you? "); 
        int userTime = scan.nextInt(); 
        scan.nextLine(); 

        System.out.println (); 

        ChatBot debbie = new ChatBot("Debbie", "coffee", 143); 
        debbie.greeting(userName);
        debbie.weather();
        double meters = debbie.convertFeetToMeters(5); 
        System.out.println ("5 feet is equal to " + meters + " meters!"); 
        debbie.favoriteNumber(127);
        int sum = debbie.addNumbers(12, 14, 26); 
        System.out.println ("The sum of 12, 14, and 26 is " + sum); 
        
        System.out.println();

        // void methods
        debbie.ageCalculation(userAge);
        debbie.favoriteFood(yourFavFood);
        // string methods 
        String message = debbie.funFact(); 
        System.out.println (message); 
        System.out.println (); 
        // numeric methods 
        double convertedWeight = debbie.convertWeight(userWeight); 
        System.out.println ("You weigh " + convertedWeight + " kilograms"); 
        double userAvg = debbie.gradeAvg(userGrade1, userGrade2, userGrade3); 
        System.out.println ("Your average grade is " + userAvg); 

        System.out.println();

        // print second string method 
        String messageTwo = debbie.timeTelling(userTime);  
        System.out.println (messageTwo); 
        String goodbye = debbie.goodbye(); 
        System.out.println (goodbye); 

        scan.close(); 

    }
}
