import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);        

    System.out.println("What is your name ? ");
    
    String name = scanner.nextLine();

    System.out.println("Hello " +name +".");

    System.out.println("How old are you ? ");

    int age = scanner.nextInt();

    System.out.println("You are " + age +" years old.");
    
    scanner.nextLine();

    System.out.println("What is your favorite food ? ");

    String food = scanner.nextLine();

    System.out.println("Your favorite food is " + food + ".");

    scanner.close();

    }
}
