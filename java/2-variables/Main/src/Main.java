package Main.src;
public class Main {

    public static void main(String[] args) {
        // declaration + assignment

        int x;
        x = 123;

        // or combine

        int y = 5;

        System.out.println(x);
        System.out.println(y);

        System.out.println("My number is " + x + " and " + y);

        long z = 1234567890123456789L;

        // long integer must have L at the end

        System.out.println(z);

        
        
        
        double a = 3.14;
        float b = 3.14f;

        // float must have f at the end

        System.out.println(a);
        System.out.println(b);

        
        
        
        boolean c = false;

        // boolean can only be true or false

        System.out.println(c);




        char symbol = '@';

        System.out.println(symbol);

        String name = "John Doe";

        System.out.println("Hello " +name);


    }
}