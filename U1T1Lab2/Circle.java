package U1T1Lab2;

public class Circle {
    private double radius; 
    
    public Circle (double radi) {
        radius = radi; 
    }

    public void areaCalc () {
        double area = Math.PI * (radius * radius);
        System.out.println ("A circle with a radius of " + radius + " has an area of  " + area);  
    }
}
