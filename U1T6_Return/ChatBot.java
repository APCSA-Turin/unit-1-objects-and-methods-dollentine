package U1T6_Return;

public class ChatBot {

   // instance variables
   private String name;
   private int number; 
   private String food;

   // constructor
   public ChatBot(String chatBotName, String favFood, int faveNum) {
       name = chatBotName;
       number = faveNum;
       food = favFood; 
   }

   // void method that prints a greeting
   public void greeting(String yourName) {
       System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
       System.out.println("and I am a chat bot! How are you today?");
   }

   // void method that prints the weather
   public void weather() {
       System.out.println("I actually don't know much about the weather! Ha ha!");
       System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
   }

   // method that converts feet to meters and returns the meters
   public double convertFeetToMeters(int numFeet) {
       final double METERS_PER_FOOT = 0.3048;
       return METERS_PER_FOOT * numFeet;
   }

   // void method that prints information about favorite numbers
   public void favoriteNumber(int yourNumber) {
       int distance = yourNumber - number;  // number is an instance variable
       System.out.println("My favorite number is " + number);
       System.out.println("That is " + distance + " away from your number!");
   }

   // method that adds and returns the sum of three numbers
   public int addNumbers(int num1, int num2, int num3) {
       return num1 + num2 + num3;
   }


   // addtional six methods from part E. (freestyle)
   // methods that use void (2)
   public void favoriteFood (String favoriteFood) {
       System.out.println ("My favorite food is " + food); 
       System.out.println ("Wow, you like " + favoriteFood + "? That's cool!");
   }
      public void ageCalculation (int yourAge) {
        int days = yourAge * 365; 
        System.out.println ("You're " + yourAge + " years old? That's " + days + " days!"); 
   }
   // string methods 
   public String funFact () { 
        return "Here's a random fun fact! Did you know otters hold hand when they fall asleep?"; 
   }
   public String timeTelling (int time) {
        return "Wow it's " + time + " o'clock! Is that night or day for you?"; 
   }
   // numeric values
   public double convertWeight(double yourWeight) {
        double newWeight = yourWeight / 2.20462; 
        double roudedWeight = (int) ((newWeight * 100) + 0.50) / 100; 
        return roudedWeight; 
   }
   public double gradeAvg(double grade1, double grade2, double grade3) {
        double avgGrade = (grade1 + grade2 + grade3) / 3; 
        double roundedAvg = (int) ((avgGrade * 100) + 0.50) / 100; 
        return roundedAvg; 
   }


   // method that returns a goodbye message -- note that this method does not print a string, but
   // rather RETURNS a string
   public String goodbye() {
       return "It was nice talking with you! Have a great day! Sincerely, " + name;
   }
}
