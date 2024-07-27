import basiccomponents.first;

public class second {

    public static void multiplication() {
        int i = 50;
        int j = 20;
        int k = i * j;
        System.out.println(k);
    }

    public static void division() {
        double i = 50;
        double j = 20;
        double k = i / j;
        System.out.println(k);
    }

    public static void main(String[] args) {
        System.out.println("inside second");

        multiplication();
        division();

        // Calling static method from another class
        first.addition();
    }
}
