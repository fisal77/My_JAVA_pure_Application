package sa.fisal7.lib;

import java.io.Console;

public class Q10 {

    public static void main(String[ ] args) {
        Console cons = System.console( );
        try {
            System.out.println("Please enter your age.");
            int age = Integer.parseInt(cons.readLine( ));
            System.out.println("You are " + age + " years old.");
        }
        catch(Exception e) {
            System.out.println("Error: A number is required.");
        }
        finally {
            System.out.println("Exit");
        }
    }
}
