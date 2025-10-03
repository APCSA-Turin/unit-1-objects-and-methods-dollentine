package src;
public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Grim", 5, 12.25); 
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Lucious", 8, 15.55);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
