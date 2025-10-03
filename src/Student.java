package src;

public class Student {
  
    private String name; 
    private int grade; 
    private double gpa; 

    public Student (String studentName, int studentGrade, double studentGPA) {
        name = studentName;
        grade = studentGrade;
        gpa = studentGPA;
    }

    public void introduction () {
        if (gpa > 3.5) {
            System.out.println ("Hello, my name is " + name + " and I am an honors student.");
        } else {
            System.out.println ("Hello, my name is " + name + " and I am a regular student.");
        }
    }

    public void yearsTillGraduation () {
        int graduationGrade = 12;
        int years = graduationGrade - grade;
        System.out.println ("I have " + years + " years of school until I graduate.");

    }

}
