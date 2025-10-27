package U1T11P3;

public class CustomStringsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods(); 
            String str = methods.pigLatin("computer");
            System.out.println(str);
            str = methods.pigLatin("sky");
            System.out.println(str);
            str = methods.pigLatin("Brooklyn");
            System.out.println(str);
            str = methods.pigLatin("weekend");
            System.out.println(str);

    }
}
