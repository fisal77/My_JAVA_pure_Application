package sa.fisal7.lib;

public class Q32 {
    public static void main(String[ ] args) {
        int a = 0;
        try {
            a = 5 / 0;
            System.out.println("Inside try: a = " + a);
        }
        catch(ArithmeticException ex) {
            System.out.print("Cannot divide by zero");
            System.out.println( );
        }
        System.out.println("Outside try: a = " + a);
    }

}
