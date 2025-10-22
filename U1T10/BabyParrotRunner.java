package U1T10;

public class BabyParrotRunner {
    public static void main(String[] args) {
        BabyParrot baby = new BabyParrot("Toucan", 3, 4.5);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);

    }
}
