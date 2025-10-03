package src;

public class StudentRunner {
    public static void main(String[] args) {
        
        Student student1 = new Student ("Tiffany", 11, 4.0);
        student1.introduction();
        student1.yearsTillGraduation();


        Student student2 = new Student ("Eloise", 9,3.4);
        student2.introduction();
        student2.yearsTillGraduation();

    }
    
}
