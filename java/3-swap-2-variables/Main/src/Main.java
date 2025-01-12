public class Main {
    public static void main(String[] args) {
        
        String x = "water";
        String y = "Kool-Aid";

        System.out.println("x: " +x);
        System.out.println("y: " +y);

        String temp = x;

        x = y;

        y = temp;

        System.out.println("x: " +x);
        System.out.println("y: " +y);

    }
}
